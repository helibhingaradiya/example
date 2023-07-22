import java.util.Arrays;

public class Remove {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int[] arr_new= new int[arr.length-1];
        int target=3;
        int k=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i] != target)
            {
                arr_new[k] = arr[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(arr_new));
    }
}
