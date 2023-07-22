import java.util.Arrays;

public class Q747 {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        System.out.println(dominantIndex(nums));
    }

    public static int dominantIndex(int[] nums) {
        int ans = 0;
       int max=Integer.MIN_VALUE;
       int maxIndex=0;
        for (int i = 0; i < nums.length; i++) {
            if (max<nums[i]){
                max=nums[i];
                maxIndex=i;
            }
        }
        System.out.println(max+" "+maxIndex);
        for (int i = 0; i < nums.length; i++) {
            int mul=nums[i]*2;
            if (nums[i]==max){
                continue;
            }
            if (mul>max){
                return -1;
            }
        }
        return maxIndex;
    }
}
