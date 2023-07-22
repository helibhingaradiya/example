public class DeleteManinRow {
    public static void main(String[] args) {
        int[][] arr = {{5, 2, 3}, {4, 50, 6}, {7, 8, 9}, {9,7,0}};
        int row=arr.length;
        int col=arr[2].length;
        for (int i = 0; i < row; i++) {
            int maxI = 0;
            for (int j = 1; j < col; j++) {
                if (arr[i][maxI] < arr[i][j]) {
                    maxI=j;
                }
            }
            for (int k = maxI; k < col-1; k++) {
                arr[i][k] = arr[i][k+1];
            }
        }
        col--;
        for (int i = 0; i < row; i++) {

            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
