import java.util.Stack;

public class Q921 {
    public static void main(String[] args) {
      String s=")(()()(())";
        System.out.println(minAddToMakeValid(s));
    }

    public static int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        int end = 0;
        int count = 0;
        while(end < s.length()) {
            if(s.charAt(end) == '(')
                stack.push(s.charAt(end));
            else if(stack.isEmpty())
                count++;
            else
                stack.pop();
            end++;
        }

        return count + stack.size();
    }
}
