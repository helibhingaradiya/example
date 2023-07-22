import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q414 {
    public static int thirdMax(int[] nums) {
        int max=Integer.MIN_VALUE;
        int count=0;
        Arrays.sort(nums);
        for (int i = nums.length-1; i >=0; i--) {
            // for (int i = 0; i<nums.length; i++) {

            if (nums[i]!=max){
                max=nums[i];
                count++;

            }
            if (count==3){
                return max;
            }

        }
        return nums[nums.length-1];
    }
    public static void main(String[] args) {
        int[] nums = {3, 2, 1};
        System.out.println(thirdMax(nums));
//        int max=Integer.MIN_VALUE;
//        int count=0;

//        Arrays.sort(nums);
////        for (int i = nums.length-1; i >=0; i--) {
//            for (int i = 0; i<nums.length; i++) {
//
//                if (nums[i]!=max){
//                max=nums[i];
//                count++;
//
//            }
//            if (count==3){
//                System.out.println(max);
//            }
//
//        }
//        int m1=Integer.MIN_VALUE;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i]>m1){
//                m1=nums[i];
//            }
//        }
//        System.out.println(m1);
//        int m2=Integer.MIN_VALUE;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i]==m1) continue;
//            if (nums[i]>m2)
//            {
//                m2=nums[i];
//            }
//        }
//        System.out.println(m2);
//        int m3=Integer.MIN_VALUE;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i]==m2 || nums[i]==m1) continue;
//            if (nums[i]>m3)
//
//            {
//                m3=nums[i];
//            }
//        }
//        System.out.println(m3);
//        int[] ans = new int[nums.length];
//        int front = 0;
//        int second = 1;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[front]==nums[second]){
//                ans[i]=nums[front];
//                front++;
//                second++;
//            }else {
//                ans[i++]=nums[i];
//            }
//        }
//        if (nums[nums.length-1]==nums[nums.length-2]){
//            System.out.println(nums[nums.length-2]);
//        }
//        System.out.println(nums[nums.length-1]);
//        System.out.println(Arrays.toString(nums));
    }
}
