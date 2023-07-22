import java.util.Stack;

public class Q2696 {
    public static void main(String[] args) {
      String s="BJKDKABJ";
      System.out.println(minLength(s));
    }

    public static int minLength(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty()){
                stack.push(s.charAt(i));
            }else if (s.charAt(i)-stack.peek()==1){
                stack.pop();
            }else {
                stack.push(s.charAt(i));
            }
        }

        return stack.size();
    }
}
