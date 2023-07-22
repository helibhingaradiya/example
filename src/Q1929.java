import java.util.Arrays;

public class Q1929 {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3};
        int ans[] = new int[nums.length * 2];
        int n = ans.length;
        int i = 0;
        for (; i < nums.length; i++) {
            ans[i] = nums[i];
        }
        int p = 0;
        for (; i < ans.length; i++) {
            ans[i] = nums[p++];
        }
        System.out.println(Arrays.toString(ans));
    }
}
