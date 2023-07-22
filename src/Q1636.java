import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Q1636 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 2, 3};
        System.out.println(Arrays.toString(frequencySort(nums)));

    }

    public static int[] frequencySort(int[] nums) {
        int[] ans = new int[nums.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        System.out.println(map);
        int o = 0;

        for (Integer i : map.keySet()) {
            for (Integer j : map.keySet()) {
                if (map.get(i) < map.get(j)) {
                    ans[o++] = map.get(j);
                }
            }
        }
        return ans;
    }
}
