import java.util.Stack;
public class Q1047 {
    public static void main(String[] args) {
        String s = "abbaca";
        System.out.println(removeDuplicates(s));
    }

    public static String removeDuplicates(String s) {
        String ans = "";
        String a="";
        Stack<Character> stk= new Stack();
        for (int i = 0; i < s.length(); i++) {
            if (stk.size()==0){
                stk.push(s.charAt(i));
            }else {
                if (s.charAt(i)==stk.peek()){
                    Character c=stk.peek();
                    stk.pop();
                }else {
                    char temp=s.charAt(i);
                    stk.push(temp);
                }
            }

        }
        while (!stk.isEmpty()){
            ans+=stk.pop();
        }

        for (int i = ans.length()-1; i >=0 ; i--) {
            a+=ans.charAt(i);
        }
        System.out.println(stk);
        return a;
    }
}
