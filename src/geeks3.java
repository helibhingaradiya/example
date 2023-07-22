import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class geeks3 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 5, 5, 5, 7};

        HashMap<Integer, Integer> map = new HashMap<>();
        int k = 10;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int target = k - arr[i];
            if (map.containsKey(target)) {
                count += map.get(target);
            }
            map.put(arr[i],map.getOrDefault(arr[i], 0) + 1);
        }
        System.out.println(count);
    }
}
