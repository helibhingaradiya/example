import java.util.Arrays;

public class Q1346 {
    public static void main(String[] args) {
        int[] arr={10,2,5,3};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (i != j && arr[i] == 2 * arr[j])
                {
                    System.out.println("true");
                }
            }
        }

    }
}
