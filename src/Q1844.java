import java.util.Arrays;

public class Q1844 {
    public static void main(String[] args) {
        String s="a1b2c3d4e";
        char[] str=s.toCharArray();
        String ans="";
        for (int i = 0; i < str.length; i++) {
            if(i % 2 != 0){
                ans += shift(str[i - 1],str[i]);
            }else {
                ans += str[i];
            }
        }

        System.out.println(ans);
    }




    private static char shift(char charAt, char s) {
        int asci = (int) charAt;
        int s1 = s - '0';
        int convert = asci + s1;
        char asciiToChar = (char) convert;
        return asciiToChar;
    }

}
