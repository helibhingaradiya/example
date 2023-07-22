import java.util.Arrays;

public class DeletionInArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int delete=5;
        System.out.println(Arrays.toString(deleteInArray(arr,delete)));
    }
    public static int[] deleteInArray(int[] arr,int delete){
        for (int i = 0; i < arr.length; i++) {
            if (delete==arr[i]){
                for (int j = i; j <arr.length-1 ; j++) {
                   arr[j]=arr[j+1];
                }
                break;
            }
        }
     return arr;
    }
}
