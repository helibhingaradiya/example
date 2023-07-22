import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Q946 {
    public static void main(String[] args) {
        int[] pushed = {2, 1, 0};
        int[] popped = {1, 2, 0};
        System.out.println(validateStackSequences(pushed, popped));
    }

    public static boolean validateStackSequences(int[] pushed, int[] popped) {
//        Queue<Integer> queue = new LinkedList<>();
//        Stack<Integer> stack = new Stack();
//        for (int i = 0; i < popped.length; i++) {
//            queue.add(popped[i]);
//        }
//        for (int i = 0; i < pushed.length; i++) {
//            if (stack.isEmpty()) {
//                if (pushed[i] == queue.peek()) {
//                    queue.remove();
//                } else {
//                    stack.push(pushed[i]);
//                }
//            } else if (pushed[i] == queue.peek()) {
//                queue.remove();
//            } else if (stack.peek() == queue.peek()) {
//                stack.pop();
//                queue.remove();
//            } else {
//                stack.add(pushed[i]);
//            }
//
//
//        }
//        while (!stack.isEmpty()) {
//            if (stack.peek() == queue.peek()) {
//                stack.pop();
//                queue.remove();
//            } else {
//                return false;
//            }
//
//        }
//        if (stack.isEmpty() && queue.isEmpty()) {
//            return true;
//        }
//        return false;

        Stack<Integer> stk = new Stack<>();
        int idx=0;

        for( int i: pushed)
        {
            stk.push(i);
            while(!stk.isEmpty() && stk.peek() == popped[idx])
            {
                stk.pop();
                idx++;
            }
        }
        return stk.isEmpty();
    }
}
