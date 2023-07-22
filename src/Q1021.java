import java.util.Stack;
public class Q1021 {
    public static void main(String[] args) {
        String s = "(()())(())(()(()))";
        System.out.println(removeOuterParentheses(s));
//        char[] arr=s.toCharArray();
//        String  str="";
//        String ans="";
//        for (int i = 0; i <s.length(); i++) {
//            if (s.charAt(i)=='(' && s.charAt(i+1)=='(' ){
//                continue;
//            }
//            str+=s.charAt(i);
//        }
//        for (int i = 0; i < str.length()-1; i++) {
//            if (str.charAt(i)==')'&& str.charAt(i+1)==')'){
//                continue;
//            }
//            ans+=str.charAt(i);
//        }
//        System.out.println(ans);
//        System.out.println(str);
    }

    public static String removeOuterParentheses(String s) {
        StringBuilder sb=new StringBuilder();
        Stack<Character> stk = new Stack<>();
       for(char ch:s.toCharArray()){
           if (stk.isEmpty()){
               stk.push(ch);
           } else if (stk.size()>=1 && ch=='(') {
               stk.push(ch);
               sb.append("(");
           } else if (stk.size()>1 && ch==')') {
               stk.pop();
               sb.append(")");
           } else if (stk.size()==1 && ch==')') {
               stk.pop();
           }
       }
        System.out.println(sb);
        System.out.println(stk);
        return sb.toString();
    }
}
