import java.util.Arrays;

public class Hw3Q3 {
    public static void main(String[] args) {
        int[] arr={2,4,6,7,8};
        Arrays.sort(arr);
        int sum=13;
        int front=0;
        int end=arr.length-1;


        for (int i=0;i<arr.length-1;i++){
            int sumans=arr[front]+arr[end];
            if (sumans==sum){
                System.out.println(front+" and "+end);

            }
           if(sumans>=sum){
               end--;
           }else{
               front++;
           }

        }
    }
}
