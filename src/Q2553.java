import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q2553 {
    public static void main(String[] args) {
        int[] nums = {13, 25, 83, 77};
        System.out.println(Arrays.toString(separateDigits(nums)));
    }

    public static int[] separateDigits(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            int temp = nums[i];
            while (temp > 0) {
                int digit = temp % 10;
                list.add(digit);
                temp /= 10;
            }

        }
        int[] ans = new int[list.size()];
        int index = 0;
        for (int i = list.size() - 1; i >= 0; i--) {
            ans[index] = list.get(i);
            index++;
        }
        return ans;
    }
}
