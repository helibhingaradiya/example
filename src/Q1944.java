import java.util.Arrays;

public class Q1944 {
    public static void main(String[] args) {
        int[] height = {10,6,8,5,11,9};
        System.out.println(Arrays.toString(canSeePersonsCount(height)));

    }

    public static int[] canSeePersonsCount(int[] heights) {
        int[] ans = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            for (int j = 0; j < heights.length; j++) {
                if (i<j && Math.min(heights[i],heights[j]) > 0){

                }
            }
        }
        return ans;
    }
}
