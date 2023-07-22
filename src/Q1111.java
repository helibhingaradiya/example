import java.util.Arrays;
import java.util.Stack;

public class Q1111 {
    public static void main(String[] args) {
        String seq = "()(())()";
        System.out.println(Arrays.toString(maxDepthAfterSplit(seq)));
    }

    public static int[] maxDepthAfterSplit(String seq) {
        int ans[] = new int[seq.length()];
        Stack<Character> stk=new Stack();
        for (int i = 0; i < seq.length(); i++) {
            if (stk.isEmpty()){
                stk.push(seq.charAt(i));
                ans[i]=0;
            } else if (stk.peek()=='('&&seq.charAt(i)=='(') {
                stk.push(seq.charAt(i));
                ans[i]=1;
            } else if ( stk.size()>1 && stk.peek()=='('&& seq.charAt(i)==')' ) {
                stk.pop();
                ans[i]=1;
            } else if (stk.size()==1  && seq.charAt(i)==')') {
                stk.pop();
                ans[i]=0;
            }
        }
        System.out.println(Math.max(1,1
        ));
        return ans;
    }
}
