import java.util.ArrayList;
import java.util.List;

public class Q2194 {
    public static void main(String[] args) {
        String s="K1:L2";
        char[] ch=s.toCharArray();
        List<String> list=new ArrayList<>();
        char[] arr={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        for (int i = 0; i < arr.length; i++) {
          String ans="";
          ans+=ch[0];
          ans+=ch[ch.length-1];
            System.out.println(ans);
        }
    }
}
