import java.util.Arrays;

public class Q1464 {
    public static void main(String[] args) {
        int[] nums={3,4,5,2};
        Arrays.sort(nums);
        int var=1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                var=(nums[i]-1)*(nums[j]-1);
            }
        }
        System.out.println(var);
    }
}
