    import java.util.Arrays;

    public class Geeks {
        public static void main(String[] args) {
            //sort array
           int sum=0;
            int[][] arr= {{1, 3,6},{2,4,6}};
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
//                    System.out.print(arr[i][j]+" ");
                    sum+=arr[i][j];
                }
                System.out.println();
            }
            System.out.println(sum);
//            int front=0;
//            int second=1;
//            int temp=0;
//
//            for (int i = 0; i < arr.length; i++) {
//                if (arr[front]<arr[second]){
//                    front++;
//                    second++;
//                } else if (arr[front]>arr[second]) {
//                    temp=arr[second];
//                    arr[second]=arr[front];
//                    arr[front]=temp;
//                    front++;
//                    second++;
//
//                }else {
//                    front++;
//                    second++;
//                }
//            }
//            System.out.println(Arrays.toString(arr));
//            int[] arr={1,2,3};
//            int n=3;
//            int front=0;
//            int second=1;
//            while (front<arr.length){
//                if (front>second){
//                    second++;
//                }else {
//                    front++;
//                }
//            }
//            System.out.println(second);

            //k smallest elements in array
//  int[] arr={7,10, 4, 3, 20, 15};
//  int k=3;
//  Arrays.sort(arr);
//            for (int i = 1; i <= arr.length; i++) {
//                if (i+1==k){
//                    System.out.println(arr[i]);
//                }
//            }
    //rearrange

    //        int[] arr = {1, 2, 3, 4, 5, 6};
    //        int temp = 0;
    //        int front = 0;
    //        int end = arr.length;
    //        int mid=front+(end-front)/2;
    //        for (int i = 0; i < arr.length; i++) {
    //
    //        }
            //move all zero
    //        int[] arr={3, 5, 0, 0, 4};
    //        int front=0;
    //        int second=1;
    //        int temp=0;
    //        for (int i = 0; i < arr.length-1; i++) {
    //
    //            if(arr[front]==0 && arr[second]!=0) {
    //                temp=arr[second];
    //                arr[second]=arr[front];
    //                arr[front]=temp;
    //                front++;
    //               second++;
    //           }else if(arr[front]!=0 && arr[second]==0){
    //
    //               second++;
    //           }else {
    //                front++;
    //                second++;
    //           }
    //        }
    //        System.out.println(Arrays.toString(arr));


    //        int[] arr = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
    //        int n = 10;
    //        for (int i = 0; i < arr.length; i++) {
    //
    //
    //            if (arr[i] == i) {
    //                arr[i] = i;
    //            } else {
    //                arr[i] = -1;
    //            }
    //
    //
    //        }
    //        System.out.println(Arrays.toString(arr));
        }
    }
