import java.util.Stack;

public class MinInStack {
    static Stack<Integer> stk=new Stack<>();
   static   Stack<Integer> minStk=new Stack<>();
    public static void main(String[] args) {

     insert(6);
     insert(10);
        delete();

        insert(3);
        System.out.println(  minvalue());

    }

    private static void delete() {
        if (stk.peek() == minStk.peek()){
            minStk.pop();
        }
        stk.pop();
    }

    private static void insert(int i) {
        if (minStk.isEmpty() || i<minStk.peek())
        {
            minStk.push(i);
        }
        stk.push(i);
    }

    private static int minvalue() {
        return minStk.peek();
    }


}
