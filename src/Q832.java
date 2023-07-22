import java.util.Arrays;

public class Q832 {
    public static void main(String[] args) {
        int[][] image = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        System.out.println(flipAndInvertImage(image));
    }


    public static int[][] flipAndInvertImage(int[][] image) {
        int row=image.length;
        int col=image[0].length;
        for (int i = 0; i < row; i++) {
                int front = 0;
                int end = col-1;
                while (front < end){
                    int temp = image[i][front];
                    image[i][front]=image[i][end];
                    image[i][end]=temp;
                    front++;
                    end--;
                }
            }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (image[i][j]==0){
                    image[i][j]=1;
                }else {
                    image[i][j]=0;
                }
            }
        }
        System.out.println(Arrays.deepToString(image));
        return image;
    }
}
