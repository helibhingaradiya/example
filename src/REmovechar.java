import java.util.Arrays;

public class REmovechar {
    public static void main(String[] args) {
        String str = "helly";
        char[] arr=str.toCharArray();
        int index=0;
        for (int i = 0; i < str.length(); i++) {
            int j = 0;
            for (; j < i; j++) {
                if (arr[i] == arr[j])
                {
                    break;
                }
            }
            if (j==i){
                arr[index++]=arr[i];
            }
        }
        System.out.println(String.valueOf(Arrays.copyOf(arr, index)));

//        int len=str.length()-1;
//        String ans=" ";
//        char[] arr=str.toCharArray();
//        int front=0;
//        int second=1;
//        int i = 0;
//        for (; i < arr.length; i++) {
//           if (arr[front]!=arr[second]){
//               front++;
//               second++;
//           } else if (arr[front]==arr[second]) {
//               break;
//           }
//        }
//        for (int j = i; j < arr.length - 1; j++) {
//            arr[j] = arr[j+1];
//        }
//        System.out.println(arr);
    }
}
