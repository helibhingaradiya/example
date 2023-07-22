public class DeleteMaxIncol {
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3}, {4, 9, 6}, {7, 8, 9},{1,3,5}};
        int row = arr.length;
        int col = arr[0].length;
        for (int i = 0; i < col; i++) {
                        int maxI = 0;

            for (int j =1; j <row ; j++) {
                if (arr[j][i] > arr[maxI][i]) {
                    maxI = j;
                }
            }

            for (int k = maxI; k < row-1; k++) {
                arr[k][i] = arr[k+1][i];
            }
        }
        row--;
        for (int i = 0; i < row; i++) {

            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
