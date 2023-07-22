public class CheckBalancedParentheses {
    public static void main(String[] args) {
        String s="[{[[]]}]";
        char[] stack=new char[s.length()];
        int top=-1;
        for (int i = 0; i < s.length(); i++) {

          if (s.charAt(i)=='{' || s.charAt(i)=='[' || s.charAt(i)=='(') {
               top=push(stack,top,s.charAt(i));
           } else if ((stack[top] == '[' && s.charAt(i) == ']')||(stack[top]== '{' && s.charAt(i) == '}')||(stack[top] == '(' && s.charAt(i) == ')')) {
               top=pop(stack,top);
           }
          else {
              top=push(stack,top,s.charAt(i));
          }

        }
        if (isEmpty(top)){
            System.out.println("balance");
        }
        else {
            System.out.println("not balanced");
        }
    }
    private static char peek(char[] stack,int top){
        return  stack[top];
    }
    private static boolean isEmpty(int top){
        if (top==-1){
            return true;
        }
        return false;
    }
    private static int pop(char[] stack,int top){
//        System.out.print(stack[top]);
        top--;
        return top;
    }
    private static int push(char[] stack,int top,char c){
        top++;
        stack[top]=c;
        return top;
    }
}
