import java.util.Arrays;
import java.util.Scanner;

public class Hw3Q1test {
    public static void main(String[] args) {
       int[] arr={1,2,3,4,5};
       int target=3;
       int i = 0;

        Scanner sc = new Scanner(System.in);
        int size=arr.length;
//        int target=sc.nextInt();
        boolean con = false;
        int j = 0;
        for(; j < arr.length; j++){
            if(arr[j] == target) {
                con = true;
                break;
            }
        }
        for(int k = j; k < arr.length - 1; k++){
            arr[k] = arr[k + 1];
        }
        System.out.println(i);
        System.out.println(Arrays.toString(arr));


//        for (int i=0;i<arr.length;i++){
//           System.out.print(arr[i]+" ");
//       }

    }
}
