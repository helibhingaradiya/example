import java.util.Arrays;
import java.util.HashMap;

public class Q2441 {
    public static void main(String[] args) {
        int[] nums = {-1,2,-3,3};
        System.out.println(findMaxK(nums));
    }

    public static int findMaxK(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                int sum=nums[i]+nums[j];
                if (sum==0){
                    return Math.abs(nums[i]);
                }
            }
        }
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i+1; j < nums.length; j++) {
//                int sum=nums[i]+nums[j];
//                if (sum==0){
//                    return Math.abs(nums[i]);
//                }
//            }
//        }
        return -1;
    }
}
