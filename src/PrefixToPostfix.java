import java.util.Stack;

public class PrefixToPostfix {
    public static void main(String[] args) {
        String str="+a*bc";
        Stack<String> stk=new Stack<>();
        char[] stack=new char[str.length()];

        for (int i = str.length()-1; i >=0 ; i--) {
            if (str.charAt(i)=='*'||str.charAt(i)=='-'||str.charAt(i)=='/'||str.charAt(i)=='+'){
                String str1=stk.peek();
                stk.pop();
                String str2=stk.peek();
                stk.pop();
                String temp=str1+str2+str.charAt(i);
                stk.push(temp);
            }else {
                stk.push(String.valueOf(str.charAt(i)));
            }
        }

        System.out.println(stk);

    }
}
