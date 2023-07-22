public class sumDiagnol {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int row = mat.length;
        int c=mat.length-1;
        int sum = 0;
        for (int i = 0; i < row; i++) {
            sum += mat[i][i];
            if (i!=c){
                sum += mat[i][c];

            }
            c--;
        }

        System.out.println(sum);

    }
}
