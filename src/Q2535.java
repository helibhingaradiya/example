public class Q2535 {
    public static void main(String[] args) {
        int[] nums = {1, 15, 6, 3};
        System.out.println(differenceOfSum(nums));
    }

    public static int differenceOfSum(int[] nums) {
        int elementsum = 0;
        int digitsum = 0;
        int absolutesum = 0;
        for (int i = 0; i < nums.length; i++) {
            elementsum += nums[i];

        }
        for (int i = 0; i < nums.length; i++) {
          int num=nums[i];
          while (num>0){
              int mod=num%10;
              digitsum+=mod;
              num=num/10;
          }
        }
        absolutesum=Math.abs(elementsum-digitsum);

        return absolutesum;
    }
}
