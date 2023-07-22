import java.util.Arrays;

public class Peakelement {
    public static void main(String[] args) {
        int[] arr={2,1,3,5,4};
        Arrays.sort(arr);
        int front = 0;
        int second = arr.length-1;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[second] >= arr[front]) {
                System.out.println(arr[second]);

            } else {
                System.out.println(front);
            }


        }
//        int temp;
//        int front=0;
//        int second=1;
//        for (int i=0;i<arr.length-1;i++){
//            if (arr[front]>arr[second]){
//                temp=arr[front];
//                arr[front]=arr[second];
//                arr[second]=temp;
//                front++;
//            }else {
//                second--;
//            }
//        }
//        for (int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
    }
}
