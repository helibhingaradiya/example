import java.util.Arrays;

public class Q922 {
    public static void main(String[] args) {
        int[] nums = {3,1,4,2};
        System.out.println(Arrays.toString(sortArrayByParityII(nums)));
    }


    public static int[] sortArrayByParityII(int[] nums) {
        int[] arr = new int[nums.length];
        int f=0;
        int s=1;
        while (s<=nums.length){
            if (f%2==0 && nums[f]%2==0){
                f++;
                s++;
            } else if (f%2==0 && nums[f]%2!=0) {
                while (nums[s]%2!=0){
                    s++;
                }
                int temp=nums[s];
                nums[s]=nums[f];
                nums[f]=temp;
                s=f+1;
            } else if (f%2!=0 && nums[f]%2!=0) {
                f++;s++;
            } else if (f%2!=0 && nums[f]%2==0) {
                while (nums[s]%2==0){
                    s++;
                }
                int temp=nums[s];
                nums[s]=nums[f];
                nums[f]=temp;
                s=f+1;
            }
        }
        return nums;
    }
}
