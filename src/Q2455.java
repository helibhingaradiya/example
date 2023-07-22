public class Q2455 {
    public static void main(String[] args) {
        int nums[]={1,2,4,7,10};
        System.out.println(averageValue(nums));
    }

    public static int averageValue(int[] nums) {
        int ans=0;
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]%2==0 && nums[i]%3==0){
                count++;
                ans+=nums[i];
            }
        }
        if(ans==0){
            return ans;
        }
        int avg=Math.abs(ans/count);
        return avg;
    }
}
