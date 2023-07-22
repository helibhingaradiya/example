import java.util.Arrays;

public class geeks4 {
    public static void main(String[] args) {
        int[] arr={3, 2, 1, 56, 10000, 167};
        int N=arr.length-1;
        System.out.println(N);
        Arrays.sort(arr);
//        for (int i=0;i<N;i++){
//
//            System.out.println(arr[i]);
//        }
        System.out.println(arr[0]);
        System.out.println(arr[N]);
    }
}
