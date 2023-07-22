import java.util.Arrays;

public class Q2148 {
    public static void main(String[] args) {
        int[] nums = {11,7,2,15};
        System.out.println(countElements(nums));
    }

    public static int countElements(int[] nums) {
        int count=0;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (min>nums[i]){
                min=nums[i];
            }
            if (max<nums[i]){
                max=nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
         if (nums[i]!=min&& nums[i]!=max){
             count++;
         }
        }
        System.out.println(min+" "+max);
//        Arrays.sort(nums);
//        int count = 0;
//        int c = 0;
//        for (int i = 1; i < nums.length - 1; i++) {
//            if (nums[i - 1] < nums[i] && nums[i + 1] > nums[i]) {
//                count++;
//            } else if (nums[i - 1] <= nums[i] && nums[i + 1] >= nums[i]) {
//                c++;
//            }
//        }
//        if (c != 0) {
//            return c;
//        }
        return count;
    }
}
