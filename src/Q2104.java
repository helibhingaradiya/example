public class Q2104 {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3};
        System.out.println(subArrayRanges(nums));

    }

    public static long subArrayRanges(int[] nums) {
        long ans = 0;
        for (int i = 0; i < nums.length; i++) {
            int min=nums[i];
            int max=nums[i];
            for (int j = i; j < nums.length; j++) {
                min=Math.min(nums[j],min);
                max=Math.max(nums[j],max);
                int sum=max-min;
                ans+=sum;
            }
        }
        return ans;
    }
}
