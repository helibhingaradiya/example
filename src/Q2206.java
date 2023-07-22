import java.util.ArrayList;
import java.util.Arrays;

public class Q2206 {
    public static void main(String[] args) {
        int[] nums={3,2,3,2,2,2};
        int len=nums.length;

        Arrays.sort(nums);
        int count=0;
        int pair=len/2;

        ArrayList<Integer> al=new ArrayList<>();
        for (int i = 0; i < nums.length; i+=2) {
            if (nums[i]==nums[i+1]){
                count++;
            }

        }
        if (count==pair){
            System.out.println("true");
        }
        System.out.println(count);
    }
}
