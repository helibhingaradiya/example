import java.util.Stack;

public class Q856 {
    public static void main(String[] args) {
        String s = "(()(()))";
        System.out.println(scoreOfParentheses(s));
    }

    public static int scoreOfParentheses(String s) {
        Stack<Integer> stack = new Stack();
        int count = 0;
        int l=0;
        while (l<s.length()){
            if (s.charAt(l)=='('){
                stack.push(count);
                count=0;
            } else  {
                count = stack.pop() + Math.max(count*2,1);
            }
            l++;
        }
        return count;

    }
}
