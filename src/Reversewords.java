import java.util.Arrays;

public class Reversewords {
    public static void main(String[] args) {
        String str="my name is helly";
        String[] arr=str.split(" ");


        for (int i = 0; i < arr.length; i++) {
           char[] char_arr = arr[i].toCharArray();
           int left = 0, right = char_arr.length - 1;
           while (left < right) {
               char temp = char_arr[left];
               char_arr[left] = char_arr[right];
               char_arr[right] = temp;
               left++;
               right--;
           }
           arr[i] = new String(char_arr);
        }

        StringBuilder ans = new StringBuilder();
        for (String s : arr) ans.append(s + " ");
        System.out.println(ans);
    }
}
