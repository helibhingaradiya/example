import java.util.Stack;

public class QueueUsingTwoStack {
    static class Queue {
        static Stack<Integer> stk1 = new Stack<>();
        static Stack<Integer> stk2 = new Stack<>();

      static boolean isEmpty() {
            if (stk1.isEmpty()) {
                return true;
            }
            return false;
        }

        static void add(int i) {
            while (!stk1.isEmpty()) {
                stk2.push(stk1.pop());
            }
            stk1.push(i);
            while (!stk2.isEmpty()) {
                stk1.push(stk2.pop());
            }
        }

        static int remove() {
            if (isEmpty()) {
                System.out.println("empty...");
                return -1;
            }
            return stk1.pop();
        }

    static int peek() {
            if (isEmpty()) {
                System.out.println("empty...");
                return -1;
            }
            return stk1.peek();
        }
    }

    ;

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }




    }
}
