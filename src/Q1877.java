import java.util.Arrays;

public class Q1877 {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 3};
        System.out.println(minPairSum(arr));
    }

    public static int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int ans = Integer.MIN_VALUE;
        int f=0;
        int l=nums.length-1;
       while (f<l){
           int sum=nums[f]+nums[l];
           ans=Math.max(ans,sum);
           f++;
           l--;
       }
        return ans;
    }
}
