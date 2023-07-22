import java.util.Arrays;

public class Q2733 {
    public static void main(String[] args) {
      int[] nums={3,2,1,4};
        System.out.println(findNonMinOrMax(nums));
    }
    public static int findNonMinOrMax(int[] nums) {
     int ans=0;
     Arrays.sort(nums);
     if (nums.length==0 || nums.length==2){
         return -1;
     }
        return nums[nums.length/2];

    }
}
