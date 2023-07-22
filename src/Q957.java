import java.util.Arrays;

public class Q957 {
    public static void main(String[] args) {
        int[] nums={-4,-1,0,3,10};
//        Arrays.sort(nums);
        for (int i=0;i<nums.length;i++){
            int mul=nums[i]*nums[i];
            nums[i]=mul;
//            System.out.println(mul);
        }
        Arrays.sort(nums);
        for (int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }
}
