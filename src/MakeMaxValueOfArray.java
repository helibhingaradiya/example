import java.util.Arrays;

public class MakeMaxValueOfArray {
    public static void main(String[] args) {
        int arr[]={32,56,7,1};
        int max=Integer.MIN_VALUE;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            String temp= String.valueOf(arr[i]);
        }
    }
}
