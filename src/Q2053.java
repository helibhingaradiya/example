import java.util.*;

public class Q2053 {
    public static void main(String[] args) {
        String[] arr={"d","b","c","b","c","a"};
        int k=2;
        int c=0;
HashSet<String> set=new HashSet<>();

        HashMap<String,Integer>map=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for (String s:arr) {
            if (map.get(s)==1){
                k--;
                if (k==0){
                    System.out.println(s);
                }
            }
        }
        System.out.println(map);
    }
}
