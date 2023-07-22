import java.util.Arrays;

public class PairWithSum {
    public static void main(String[] args) {
        int[] arr={1,3,4,6,7};
        Arrays.sort(arr);
        int front=0;
        int last=arr.length-1;
        int sum=50;
        while (front<=last)
        { int s=arr[front]+arr[last];
            if (s<sum){
                front++;
            }else {
                last--;
            }
            if (s==sum){
                System.out.println("pair found");
                return;
            }
        }
        System.out.println("pair not found");
    }
}
