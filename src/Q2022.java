import java.util.Arrays;

public class Q2022 {
    public static void main(String[] args) {
        int[] original = {1, 2};
        int m = 1;
        int n = 1;
        System.out.println(Arrays.deepToString(construct2DArray(original, m, n)));
    }

    public static int[][] construct2DArray(int[] original, int m, int n) {
        int[][] ans = new int[m][n];
        if (m * n != original.length)
        {
            return new int[][]{};
        }
        int k = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans[i][j]=original[k++];
            }
        }
        return ans;
    }
}
