public class TopLeftTo {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int row=arr.length;
        int col=arr[0].length;
        for (int i = 0; i < row; i++) {
            System.out.print(arr[i][i]+" ");
            System.out.println();
        }
    }
}
