import java.util.Arrays;

public class Q1304 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sumZero(n));
    }

    public static int[] sumZero(int n) {
        int[] arr = new int[n];
        int len=arr.length/2;
        int l=(~(len-1));
        int n1 = 0;

        for (int i = l; i <= len; i++) {
            if (n % 2 == 0 && i == 0) {
                continue;
            } else {
                arr[n1++] = i;
            }
        }
        return arr;
    }
}
