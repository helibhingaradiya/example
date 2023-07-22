import java.util.Stack;
public class Q844 {
    public static void main(String[] args) {
        String s = "y#fo##f";
        String t = "y#f#o##f";
        System.out.println(backspaceCompare(s, t));
    }

    public static boolean backspaceCompare(String s, String t) {
        Stack<Character> stk1=new Stack<>();
        Stack<Character> stk2=new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '#' && stk1.isEmpty()) stk1.push('#');
            else if (ch == '#') stk1.pop();
            else stk1.push(ch);
        }

        for (char ch : t.toCharArray()) {
            if (ch == '#' && stk2.isEmpty()) stk2.push('#');
            else if (ch == '#') stk2.pop();
            else stk2.push(ch);
        }

        // if (stk1.size() != stk2.size()) return false;

        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        while (!stk1.isEmpty()) {
            if (stk1.peek() != '#') s1.append(stk1.pop());
            else stk1.pop();
        }

        while (!stk2.isEmpty()) {
            if (stk2.peek() != '#') s2.append(stk2.pop());
            else stk2.pop();
        }

        return (s1.toString()).equals(s2.toString());
    }
}
