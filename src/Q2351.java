import java.util.HashMap;
import java.util.HashSet;

public class Q2351 {
    public static void main(String[] args) {
        String s="abccbaacz";
        HashSet<Character> set=new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
            }else {
                System.out.println(s.charAt(i));
                return;
            }
        }
//        for (int i = 0; i < s.length()-1; i++) {
//            if (s.charAt(i)==s.charAt(i+1)){
//                System.out.println(s.charAt(i));
//            }
//        }
//        for (int i = 0; i < s.length()-1; i++) {
//            for (int j = i+1; j < s.length(); j++) {
//                if (s.charAt(i)==s.charAt(j)){
//
//                }
//            }
//        }
    }
}
