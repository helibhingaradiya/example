import java.util.Arrays;

public class Movezeroandone {
    public static void main(String[] args) {
        int[] arr = {3,5,0,0,4};

        int temp = 0;
        int front = 0;
        int second = 1;
       while (second< arr.length){
            if (arr[front]!=0 && arr[second]!=0)
            {
                second++;
            } else if (arr[front]==0 && arr[second]!=0) {
             temp=arr[second];
                arr[second]=arr[front];
                arr[front]=temp;
                front++;
                second--;
            }else {
                front++;
                second++;
            }

        }
//        while (front<=second){
//            if (arr[front]==0){
//                front++;
//            } else if (arr[second]==1) {
//                second--;
//            } else if (arr[front]==1 && arr[second]==0) {
//                temp=arr[front];
//                arr[front]=arr[second];
//                arr[second]=temp;
//                front++;
//                second--;
//            }
//        }
//        for (int i = 0; i < arr.length - 1; i++) {
//            if (arr[front] == 1 && arr[second] == 1) {
//                second++;
//            } else if (arr[front] == 1 && arr[second] == 0) {
//                temp = arr[front];
//                arr[front] = arr[second];
//                arr[second] = temp;
//                front++;
//                second++;
//            } else {
//                front++;
//                second++;
//            }
//        }
        System.out.println(Arrays.toString(arr));

    }
}
