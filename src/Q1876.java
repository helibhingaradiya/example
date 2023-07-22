import java.util.HashMap;
import java.util.Map;

public class Q1876 {
    public static void main(String[] args) {
        String s = "xyzzaz";
        System.out.println(countGoodSubstrings(s));
    }

    public static int countGoodSubstrings(String s) {
        int count = 0;
        for (int i = 0; i < s.length()-3; i++) {
            String str="";
            for (int j = 1; j <3 ; j++) {
              str+=s.charAt(j);
            }
            int f=0;
            int l=str.length()-1;
            int c=0;
            while (f<l){
            if (str.charAt(f)!=str.charAt(l)){
                f++;
                l--;
                c++;
            }
            if (c==3/2){
                count++;
            }
            }

        }
        return count;
    }
}
