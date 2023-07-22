import java.util.Arrays;
import java.util.HashMap;

public class Q1331 {
    public static void main(String[] args) {
        int[] arr = {37,12,28,9,100,56,80,5,12};
        System.out.println(Arrays.toString(arrayRankTransform(arr)));
    }

    public static int[] arrayRankTransform(int[] arr) {
        int[] ans = new int[arr.length];
        int[] a=new int[arr.length];
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            a[i]=arr[i];
        }
        Arrays.sort(a);
        for (int i =0; i <a.length-1 ; i++) {
            if (map.containsKey(a[i])){
             map.put(a[i],map.getOrDefault(a[i],map.get(i)));
            }else {
                map.put(a[i],map.getOrDefault(a[i],i+1));
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for(Integer j:map.keySet()){
                if (arr[i]==j){
                    ans[i]=map.get(j);
                }
            }
        }

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(arr));
        System.out.println(map);
        return ans;
    }
}
