import java.util.Stack;

public class Q1598 {
    public static void main(String[] args) {
 String[] logs={"./","../","./"};
        System.out.println(minOperations(logs));
    }

    public static int minOperations(String[] logs) {
        Stack<String> stk = new Stack<>();
        for (int i = 0; i < logs.length; i++) {
         if (logs[i].equals("../") && (!stk.isEmpty())){
             stk.pop();
         } else if (logs[i].equals("./")) {
             continue;
         }else if(logs[i].equals("../") && (stk.isEmpty())){
             continue;
         }else {
             stk.push(logs[i]);
         }
        }
        return stk.size();
    }
}
