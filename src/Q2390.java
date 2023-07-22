import java.util.Stack;

public class Q2390 {
    public static void main(String[] args) {
    String s="leet**cod*e";
        System.out.println(removeStars(s));
    }

    public static String removeStars(String s) {
        String ans = "";
        String a="";
        Stack<Character> stk=new Stack();
        for (int i = 0; i < s.length(); i++) {
            if (stk.isEmpty()){
                stk.push(s.charAt(i));
            } else if (s.charAt(i)=='*') {
                stk.pop();
            }else {
                stk.push(s.charAt(i));
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
