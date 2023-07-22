import java.lang.reflect.Array;
import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
        //selection
        int[] arr={7,8,5,2,1};
        for (int i = 0; i < arr.length; i++) {
            int smallest=i;
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;

        }
        System.out.println(Arrays.toString(arr));
        //insertion
        int[] arrInsertion={7,8,1,5,3};
        for (int i = 1; i <arrInsertion.length ; i++) {
            int current=arrInsertion[i];
            int j=i-1;
            while (j>=0 && current <arrInsertion[j] ){
                arrInsertion[j+1]=arrInsertion[j];
                j--;
            }
            arrInsertion[j+1]=current;
        }
        System.out.println(Arrays.toString(arrInsertion));
    }
}
