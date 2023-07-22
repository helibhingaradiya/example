import java.util.Arrays;

public class Q2124 {
    public static void main(String[] args) {
        String s="aaabaabb";
        System.out.println((int)'b');
        char[] arr=s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
              if (arr[i]!=97 && arr[j]!=98){
                  System.out.println("false");
              }
            }
        }
    }
}
