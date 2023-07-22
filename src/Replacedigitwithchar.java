import java.util.Arrays;

public class Replacedigitwithchar {
    public static void main(String[] args) {
        String str="my1 name2";
        char[] arr=str.toCharArray();

        for (int i = 0; i < arr.length; i++) {

            int k=(int)str.charAt(i);
            if (k>=48 && k<=57){
             arr[i]='h';
         }
        }
        System.out.println(new String(arr));

    }
}
