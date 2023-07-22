import java.util.Stack;

public class ReverseNumberUsingStack {
    public static void main(String[] args) {
        Stack<Character> stk = new Stack<>();
        int num = 123;
        String n = String.valueOf(num);
        String ans="";
        for (int i = 0; i < n.length(); i++) {
            stk.push(n.charAt(i));
        }
       while (!stk.isEmpty()){
           ans+=stk.pop();
       }
        System.out.println(ans);
    }
}
