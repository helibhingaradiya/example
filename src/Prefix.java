import java.util.Arrays;

public class Prefix {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int[] ans={arr.length};
        for (int i = 1; i < arr.length; i++) {
            arr[i]=arr[i]+arr[i-1];
        }
        System.out.println(Arrays.toString(arr));
    }
}
