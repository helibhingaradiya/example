import java.util.Arrays;

public class Q561 {
    public static void main(String[] args) {
   int[] nums={1,4,3,2};
        System.out.println(arrayPairSum(nums));
    }
    public static int arrayPairSum(int[] nums) {
        int ans = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i+=2) {
            ans += Math.min(nums[i], nums[i + 1]);
        }
        return ans;
    }
}
