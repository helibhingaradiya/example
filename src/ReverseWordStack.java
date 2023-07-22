import java.util.*;
import java.util.Stack;

public class ReverseWordStack {
    public static void main(String[] args) {
        String str="who are you?";
        System.out.println(reverse(str));
    }

    private static String reverse(String str) {
        StringBuilder sb = new StringBuilder();
        ArrayList<Character> list = new ArrayList<>();
        int top = -1;

        for (char ch : str.toCharArray()) {
            if (ch == ' ') {
                while (top != -1) {
                    sb.append(list.remove(top--));
                }
                sb.append(' ');
            } else {
                ++top;
                list.add(ch);
            }
        }

        while (top != -1) {
            sb.append(list.remove(top--));
        }

        return sb.toString();
    }
}
