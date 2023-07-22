import java.util.Arrays;
import java.util.Stack;

public class Q394 {
    public static void main(String[] args) {
        String s = "3[a]2[bc]";
        int temp[] = {73, 74, 75, 71, 69, 72, 76, 73};
        int nums[] = {1, 1, 2, 2, 3, 3};
        System.out.println(Arrays.toString(decodeString(temp)));
//        System.out.println(minDeletion(nums));
    }

    public static int[] decodeString(int[] temp) {
        Stack<Integer> stack = new Stack<>();
        int ans[] = new int[temp.length];
        for (int i = 0; i < temp.length; i++) {
            while (!stack.isEmpty() && temp[i] > temp[stack.peek()]) {
                System.out.println(temp[stack.peek()]);
                int idx = stack.pop();
                ans[idx] = i - idx;
            }
            stack.push(i);
        }
        return ans;
    }
    public static int minDeletion(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                count++;
            }
        }

        int len = nums.length - count;
        if (len % 2 == 0) {
            return count;
        } else {
            return count;
        }

    }


}
