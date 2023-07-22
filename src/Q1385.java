import java.util.Scanner;

public class Q1385 {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 2, 3};
        int[] arr2 = {-4, -3, 6, 10, 20, 30};
        int d = 3;
        System.out.println(findTheDistanceValue(arr1, arr2, d));
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();

    }

    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int ans = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                int a = arr1[i] - arr2[j];
                if (Math.abs(a) <= d) {
                    ans = i;
                    System.out.println();
                }

            }
        }
        return ans;
    }
}
