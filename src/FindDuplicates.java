import java.util.Arrays;

public class FindDuplicates {
    public static void main(String[] args) {
     int[] arr={1,2,3,4,5,2};
        Arrays.sort(arr);
     int s=0;
     int len=arr.length-1;
     int sum=(len*(len+1))/2;

        for (int i = 0; i < arr.length; i++) {
            s+=arr[i];
        }
        System.out.println(s-sum);

//        for (int i = 0; i <arr.length ; i++) {
//            for (int j = i+1; j <arr.length ; j++) {
//                if(arr[i]==arr[j]){
//                    System.out.println(arr[j]);
//
//                    return;
//                }else {
//
//                }
//            }
//        }
//        System.out.println("no duplicates");
    }
}
