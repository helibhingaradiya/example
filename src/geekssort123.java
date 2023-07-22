import java.util.Arrays;

public class geekssort123 {
    public static void main(String[] args) {
        int[] arr = {1, -1, 3, 2, -7, -5, 11, 6};
//        Arrays.sort(arr);
        int n = arr.length;
        int temp;
        int front=0;
        int second = 1;
//        System.out.println(end);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[front] <=0 && arr[second] >=0) {
                temp = arr[front];
                arr[front] = arr[second];
                arr[second] = temp;
                front++;
                second++;
            }
            else if(arr[front]<=0 && arr[second]<=0){
                second++;
            }else {
                front++;
                second++;
            }

        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");

        }
    }
}
