import java.util.Arrays;

public class geekscountchar {
    public static void main(String[] args) {
        int[] A = {1, 2, 3};
        Arrays.sort(A);
        int front = 0;
        int second = A.length-1;

        for (int i = 0; i < A.length - 1; i++) {
            if (A[second] >= A[front]) {
                System.out.println(second);
                break;
            } else {
                front--;
                second--;
            }


        }

    }
}
