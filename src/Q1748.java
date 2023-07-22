import java.util.*;

public class Q1748 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
 list.add(nums[i] );

        }
        System.out.println(list);
//        int sum = 0;
//        Arrays.sort(nums);
//        int i=0;
//        for (i=0;i<nums.length-1;i++){
//            if (nums[i]==nums[i+1]){
//                i++;
//                continue;
//            }else {
//                sum+=nums[i];
//            }
//        }
//        while(i < nums.length){
//            sum+=nums[i];
//        }
//
//        System.out.println(sum);
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
//        }
//        for (int i = 0; i < nums.length; i++) {
//            if (map.containsKey(nums[i])) {
//                int temp = map.get(nums[i]);
//                if (temp == 1) {
//                    sum += nums[i];
//                }
//            }
//        }
//        System.out.println(sum);
        

    }
}
