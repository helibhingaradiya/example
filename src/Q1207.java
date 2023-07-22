import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Q1207 {
    public static void main(String[] args) {
        int[] arr = {1, 2};
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer>set=new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int max=Integer.MIN_VALUE;
        for (Map.Entry<Integer,Integer> m:map.entrySet()){
            if (m.getValue()>max){
                max=m.getValue();
            }
        }

        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
                if (m.getValue()==max){
                    if (!set.contains(m.getValue())){
                        set.add(m.getValue());
                    }else {
                        System.out.println("false");
                    }
                }
        }
    }
}
