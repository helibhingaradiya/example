import java.util.Stack;

public class Q678 {
    public static void main(String[] args) {
        String s = "(*)*)()";
        System.out.println(checkValidString(s));
    }

    public static boolean checkValidString(String s) {
        Stack<Character> paran = new Stack();
        Stack<Character> star = new Stack();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                paran.push((char) i);
            }
            if (c == '*') {
                star.push((char) i);
            }
            if (c == ')' && paran.size() == 0 && star.size() == 0) {
                return false;
            } else if (c == ')' && paran.size() > 0) {
                paran.pop();
            } else if (c == ')' && star.size() > 0) {
                star.pop();
            }
        }
        if (!paran.isEmpty() && star.isEmpty()) {
            return false;
        }
        while (!paran.isEmpty()) {
            int p = paran.pop();
            int st = star.pop();
            if (st < p || (!paran.isEmpty() && star.isEmpty())) return false;

        }
        return true;
    }
}
