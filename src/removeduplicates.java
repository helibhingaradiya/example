import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class removeduplicates {
    public static void main(String[] args) {
        int arr[] = {2, 3, 1, 2, 3};

        int j = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j]=arr[i+1];
                j++;
            }
        }

        System.out.println(j);

    }


}
