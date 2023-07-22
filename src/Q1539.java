import java.util.ArrayList;
import java.util.Arrays;

public class Q1539 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 11};
        int k=5;
        int temp=1;
        int idx=0;
      int[] f=new int[2004];
        for (int i:arr) {
            f[i]++;
        }
        while (true){
            if (f[temp]==0){
                idx++;
            }
            if (idx==k){
                System.out.println(temp);
                break;
            }
            temp++;
        }
































//        int[] arr = {1,2,2,4};
//        int len=arr.length;
//        int front=0;
//        int second=1;
//        for (int i=0;i<arr.length;i++){
//            if (arr[front]==arr[second]){
//                System.out.println(arr[second]+" "+ (arr[second] + 1));
//                return;
//            }
//           else if (arr[front]!=arr[second]){
//                front++;
//                second++;
//            }
//        }
//        ArrayList<Integer> ans = new ArrayList<>();
//        int sum=(len*(len+1))/2;
//
//        for (int i=0;i<arr.length;i++){
//            if (!ans.contains(arr[i])){
//                sum-=arr[i];
//                ans.add(arr[i]);
//            }
//        }
//        for (int i=0;i<arr.length-1;i++){
//            if (arr[i]==arr[i+1]){
//                System.out.println(arr[i]);
//            }
//        }
//
//        System.out.println(sum);


//        int k = 5;
//        int front = 0;
//        int end = arr.length;
//        for (int i = 0; i < arr.length; i++) {
//            if (!ans.contains(arr[i])) {
//                ans.add(arr[i]);
//            }
//        }
//
//        for (int i=0;i<ans.size();i++){
//            System.out.print(ans.get(i));
//        }

    }
}
