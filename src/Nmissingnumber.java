import java.util.Arrays;

public class Nmissingnumber {
    public static void main(String[] args) {
        int[] arr={1,3,5,4};

        int len=arr.length+1;
        int sum=(len*(len+1))/2;

        for (int i = 0; i < arr.length; i++) {
            sum-=arr[i];
        }
        System.out.println(sum);
    }
}
