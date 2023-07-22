import java.util.Stack;
public class Q682 {
    public static void main(String[] args) {
  String[] operations={"5","-2","4","C","D","9","+","+"};
        System.out.println(calPoints(operations));

    }

    public static int calPoints(String[] operations) {
        int sum = 0;
        Stack<String> stk=new Stack();
        for (int i = 0; i < operations.length; i++) {
            if (stk.size()==0){
                stk.push(operations[i]);
            }else {
                if (operations[i].equals("C")){
                    String temp=stk.peek();
                    stk.pop();
                } else if (operations[i].equals("D")) {
                    int temp=2* Integer.parseInt(stk.peek());
                    stk.push(String.valueOf(temp));
                }else if(operations[i].equals("+")) {
                    int f=Integer.parseInt(stk.peek());
                    stk.pop();
                    int s=Integer.parseInt(stk.peek());
                    stk.pop();
                    int a=f+s;
                    sum=f+s+a;
                   stk.push(String.valueOf(s)) ;
                   stk.push(String.valueOf(f)) ;
                   stk.push(String.valueOf(a)) ;
                }else {
                    stk.push(operations[i]);
                }
            }
        }
        System.out.println(stk);
        return sum;
    }
}
