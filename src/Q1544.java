import java.util.Stack;

public class Q1544 {
    public static void main(String[] args) {
//        String s = "Pp";
//        System.out.println(makeGood(s));
        String s = "))())(";
        System.out.println(minInsertions(s));
    }

    public static int minInsertions(String s) {
        Stack<Character> stack=new Stack<>();
        int count=0;
        for(int i=0;i<s.length();i++){
// -Keep adding left barckets
            if(s.charAt(i)=='('){
                stack.push(s.charAt(i));
            }else{
                if(i+1<s.length()&& s.charAt(i+1)==')'){
                    // -Skip it as two consecutives are present
                    i++;
                }else count++;

                if(!stack.isEmpty()){
                    stack.pop();
                }else count++ ;
            }
        }
        count+=2*stack.size();
        return count;
    }

    public static String makeGood(String s) {
        String ans = "";
        Stack<Character> stk = new Stack();
        Stack<Character> ansStack = new Stack();

        for (char ch : s.toCharArray()) {
            if (stk.isEmpty()) {
                stk.push(ch);
            } else if (stk.peek() - ch == 32 || stk.peek() - ch == -32) {
                stk.pop();
            } else {
                stk.push(ch);
            }
        }

        while (!stk.isEmpty()) {
            ansStack.push(stk.pop());
        }
        while (!ansStack.isEmpty()) {
            ans += ansStack.pop();
        }
        return ans;
    }
}
