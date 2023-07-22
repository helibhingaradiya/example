import java.util.Stack;

public class PrefixToInfix {
    public static void main(String[] args) {
        Stack<String> stk = new Stack();
//        String str = "";
        String s = "+a*bc";
        char[] stack = new char[s.length()];
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '+' || s.charAt(i) == '*' || s.charAt(i) == '/' || s.charAt(i) == '-') {
                String str1 = stk.pop();
//                str += s.charAt(i);
                String str2= stk.pop();
                String temp= String.valueOf(str1+s.charAt(i)+str2);
                stk.push(temp);

            } else {
                stk.push(String.valueOf(s.charAt(i)));
            }
        }
        System.out.println(stk);

    }
}
