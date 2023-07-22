import java.util.Arrays;

public class geeksSortarray {
    public static void main(String[] args) {
        int[] arr={1,4,6,2,8,3};
        int n=arr.length;

        Arrays.sort(arr);
        for (int i=0;i<arr.length-1;i++){
            System.out.println(arr[i]);
        }
    }
}
