public class ReverseUsingStack {
    public static void main(String[] args) {
        String str = "hello my name is helly";
        int size = str.length();
        char[] arr = new char[size];
        char[] stack = new char[size];
        int top = -1;
        for (int i = 0; i < arr.length; i++) {
            top = push(str.charAt(i), stack, top, size);

        }
        for (int i = 0; i < size; i++) {
            top=pop(stack,top);
        }

//   display(stack, top);
    }

    private static int pop(char[] stack, int top) {
        System.out.print(stack[top]);
        top--;
        return top;

    }

    private static void display(char[] stack, int top) {
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i]);
        }
    }

    private static int push(char arr, char[] stack, int top, int size) {
        if (top == size) {
            System.out.println("your stack is overflow");
            return top;
        }
        top++;
        stack[top]=arr;
        return top;
    }
}
