import java.util.Arrays;
import java.util.Stack;

public class Q503 {
    public static void main(String[] args) {
        int nums[] = {1, 2, 1};
        System.out.println(Arrays.toString(nextGreaterElements(nums)));
    }

    public static int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack();
        int ans[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int j = i;
            while (nums[i] < nums[j]) {
                if (nums[i] < nums[j]) {
                    ans[i] = nums[j];
                } else {
                    ans[i] = -1;
                }
                j++;
            }
//            stack.push(nums[i]);
        }
        return ans;
    }
}
