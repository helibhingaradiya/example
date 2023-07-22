import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Q389 {

    public static void main(String[] args) {
        String s = "a";
        String t = "aa";
        HashSet<Character> set = new HashSet<>();
        List<Character> list = new ArrayList<>();
        char ans = ' ';
        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
        }
        for (int i = 0; i < t.length(); i++) {

            if (!list.contains(t.charAt(i))) {
                ans = t.charAt(i);
            }
        }
        System.out.println(ans);
        System.out.println(set);
    }
}
