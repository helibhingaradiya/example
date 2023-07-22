public class Stack {
    public static void main(String[] args) {
        int top = -1;
        int size = 5;
        int[] stack = new int[size];
        top = push(stack, top, size, 10);
        top = push(stack, top, size, 20);
        top = push(stack, top, size, 30);
        top = pop(stack, top);
        peek(stack,top);
        display(stack, top);
        isEmpty(stack,top);
    }

    private static void isEmpty(int[] stack, int top) {
        if (top==-1){
            System.out.println("stack is empty");
            return;
        }
    }

    private static void peek(int[] stack, int top) {
        if (top==-1){
            System.out.println("stack is empty");
            return;
        }
        System.out.println(stack[top]+" is peek");
    }

    private static int pop(int[] stack, int top) {
        if (top == -1) {
            System.out.println("stack is empty");
            return top;
        }
        System.out.println(stack[top] + " popped");
        top--;
        return top;
    }

    private static void display(int[] stack, int top) {
        if (top == -1) {
            System.out.println("stack is empty");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
    }

    private static int push(int[] stack, int top, int size, int value) {
        if (top == size) {
            System.out.println("stack overflow");
            return top;
        }
        top++;
        stack[top] = value;
        return top;
    }
}
