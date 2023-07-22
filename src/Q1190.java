import java.util.Stack;
public class Q1190 {
    public static void main(String[] args) {
        String s="(u(love)i)";
        System.out.println(reverseParentheses(s));
    }
    public static String reverseParentheses(String s) {
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
            if(c == ')'){
                StringBuilder stringBuilder = new StringBuilder();
                while (stack.peek() != '('){
                    stringBuilder.append(stack.pop());
                }
                stack.pop();
                int i = 0;
                while (i < stringBuilder.length()){
                    stack.push(stringBuilder.charAt(i++));
                }
            }
            else
                stack.push(c);
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.empty()){
            stringBuilder.append(stack.pop());
        }
        return stringBuilder.reverse().toString();
    }
}
