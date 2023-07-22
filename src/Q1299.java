import java.util.Arrays;

public class Q1299 {
    public static void main(String[] args) {
        int[] arr={17,18,5,4,6,1};

        for (int i = 0; i < arr.length-1; i++) {
            int max=0;
            for (int j = i+1; j < arr.length; j++) {
                max=Math.max(max,arr[j]);
            }
            arr[i]=max;
        }
        arr[arr.length-1]=-1;
        System.out.println(Arrays.toString(arr));
//        while (front<second){
//
//          if (arr[front]>arr[second]){
//              temp=arr[front];
//              arr[f]=temp;
//              second--;
//
//          }
//            front++;
//
//      }

    }
}
