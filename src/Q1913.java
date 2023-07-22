import java.util.Arrays;

public class Q1913 {
    public static void main(String[] args) {
        int[] nums={5,6,2,7,4};
        Arrays.sort(nums);
        int mul=1;
        int mul1=1;

        int sub=0;
       mul=nums[0]*nums[1];
       mul1=nums[nums.length-2]*nums[nums.length-1];
        System.out.println(mul1-mul);
    }
}
