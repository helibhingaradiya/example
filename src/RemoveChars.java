import java.util.Arrays;

public class RemoveChars {
    public static void main(String[] args) {
        String str="hello world";
        char[] arr=str.toCharArray();
        int index=0;
        for (int i = 0; i < arr.length; i++) {
            int j=0;
            for (; j <i ; j++) {
                if (arr[i]==arr[j]){
                    break;
                }
            }
            if (j == i){
                arr[index++]=arr[i];
            }
        }

        System.out.println(String.valueOf(Arrays.copyOf(arr,index)));
    }
}
