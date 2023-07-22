import java.util.Arrays;

public class Q2373 {
    public static void main(String[] args) {
        int[][] grid = {{9, 9, 8, 1}, {5, 6, 2, 6}, {8, 2, 6, 4}, {6, 2, 2, 2}};
        System.out.println(largestLocal(grid));
    }

    public static int[][] largestLocal(int[][] grid) {
        int[][] ans=new int[grid.length-2][grid.length-2];
        for (int i = 0; i < grid.length-2; i++) {
            for (int j = 0; j < grid[i].length-2; j++) {
                int max=Integer.MIN_VALUE;

                for (int k = i; k < i+3; k++) {
                    for (int l = j; l < j+3; l++) {
                        if (grid[k][l]>max){
                           max= grid[k][l];
                        }
                    }
                  ans[i][j]=max;
                }
            }
        }
        System.out.println(Arrays.deepToString(ans));
        return ans;
    }
}
