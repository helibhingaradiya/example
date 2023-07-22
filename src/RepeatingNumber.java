import java.util.HashMap;
import java.util.HashSet;

public class RepeatingNumber {
    public static void main(String[] args) {
        int[] arr={1, 5, 3, 4, 3, 5, 6};
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        for (int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);

        }
//        System.out.println(map);
        for (int i=0;i<arr.length;i++){
            if (!map.containsKey(arr[i])){

            }
        }
    }
}
