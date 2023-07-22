import java.util.Stack;
public class RemoveAllAdjacentDuplicate {
    public static void main(String[] args) {
        String str="abbaca";
        String ans="";
        Stack<Character> stk=new Stack();
        Stack<Character> rev=new Stack<>();
        for (int i = 0; i < str.length(); i++){
            if (stk.isEmpty()){
                stk.push(str.charAt(i));
            }else if (stk.peek()==str.charAt(i)){
                stk.pop();
            }else {
                stk.push(str.charAt(i));
            }
        }
        while (!stk.isEmpty()){
            rev.push(stk.pop());
        }
        while (!rev.isEmpty()){
            ans+=rev.pop();
        }
        System.out.println(ans);
    }
}
