import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q1394 {
    public static void main(String[] args) {
        int[] arr={2,2,3,4};
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        int val=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==map.get(arr[i])){
                val=Math.max(arr[i],val);
            }
        }
        System.out.println(val);
    }
}
