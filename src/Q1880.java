import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q1880 {
    public static void main(String[] args) {
        String firstWord = "j";
        String secondWord = "j";
        String targetWord = "bi";
        System.out.println(isSumEqual(firstWord, secondWord, targetWord));
    }

    public static boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
//        char[] first = firstWord.toCharArray();
        HashMap<Integer,Character> map = new HashMap<>();
        String first="";
        String second="";
        String target="";
        for (int i = 0; i < firstWord.length(); i++) {
             first+= String.valueOf(firstWord.charAt(i) - 97);
        }
        for (int i = 0; i < secondWord.length(); i++) {
             second+=String.valueOf(secondWord.charAt(i) - 97);
        }
        for (int i = 0; i < targetWord.length(); i++) {
            target+=String.valueOf(targetWord.charAt(i) - 97);
        }
        int a = Integer.valueOf(first);
        int b = Integer.valueOf(second);
        int c = Integer.valueOf(target);
        int sum=0;
        sum=a+b;
        if (sum==c){
            return true;
        }
        return false;
    }
}
