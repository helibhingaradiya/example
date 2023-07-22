import java.util.Arrays;

public class Q1470 {
    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;
        int front = 0;
        int front2 = 1;

        int end = nums.length - 1;
        int[] ans = new int[nums.length];
        int i = 0;
        while (front < end) {
            int mid = front + (end - front) / 2;
            ans[front]=nums[i];
            ans[front2] = nums[mid + 1];
            front2 += 2;
            front += 2;
            i++;
            mid++;
        }
        System.out.println(Arrays.toString(ans));


    }
}
