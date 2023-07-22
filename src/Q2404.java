import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Q2404 {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0,0,0,0,0,0};
//        int count=0;
        int max = 0;
        boolean flag = false;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if(nums[i] == 0) {
                flag = true;
            }else {
                flag = false;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0 && nums[i] != 0) {
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
                max = Math.max(max, map.get(nums[i]));
            }
//            System.out.println(map);
        }

        int min = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> it : map.entrySet()) {
            if (it.getValue() == max) {
                min = Math.min(min, it.getKey());
            }

        }

        System.out.println(max);

//        for (int i = 0; i < map.size(); i++) {
//            System.out.println("first: "+map.get(nums[i]));
//
//        }

        HashSet<Integer> set = new HashSet<>();
//        for (int i=0;i<nums.length;i++){
//            if (nums[i]%2==0) {
//                if (!set.contains(nums[i])) {
//                    set.add(nums[i]);
//                } else {
//                    if (nums[i]<nums[i+1]){
//                        System.out.println(nums[i]);
//                    }
//                }
//
//            }
//        }
//        for (int i=0;i<nums.length-1;i++){
//            if (nums[i]%2==0){
//                if (nums[i]==nums[i+1]){
//                    count++;
//
//                    if (nums[i]>nums[i+1]){
//                        System.out.println(nums[i]);
//                        return;
//                    }
//                }
//
//            }
//        }

    }
}
