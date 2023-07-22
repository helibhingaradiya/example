import java.util.Arrays;

public class Q2500 {
    public static void main(String[] args) {
        int[][] grid = {{1, 4, 4}, {3, 3, 1},{4,5,6}};
        System.out.println(deleteGreatestValue(grid));
    }

    public static int deleteGreatestValue(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        int sum = 0;
        for (int i = 0; i < row; i++) {
            Arrays.sort(grid[i]);
        }
        for (int i = 0; i < col; i++) {
            int max=Integer.MIN_VALUE;
            for (int j = 0; j < row; j++) {
                if (max<grid[j][i]){
                    max=grid[j][i];
                }
            }
            sum+=max;

        }

        return sum;
    }
}
