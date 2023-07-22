import java.util.Arrays;

public class Q867 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        System.out.println(Arrays.deepToString(transpose(matrix)));
    }

    public static int[][] transpose(int[][] matrix) {
     int[][] ans=new int[matrix[0].length][matrix.length];
     int row= matrix.length;
     int col=matrix[0].length;
        for (int i = 0; i <col ; i++) {
            for (int j = 0; j <row ; j++) {
                ans[i][j]=matrix[j][i];
            }
        }
        System.out.println(Arrays.toString(ans));
     return ans;
    }
}
