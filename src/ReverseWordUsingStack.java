public class ReverseWordUsingStack {
    public static void main(String[] args) {
     String str="my name is helly";
     int size=str.length();
     char[] stack=new char[size];
     int top=-1;
        for (int i = 0; i < size; i++) {
           if (str.charAt(i)==' '){
               while (!isEmpty(top)){
                   top=pop(stack,top);
               }
               System.out.print(" ");
           }else {
               top=push(str.charAt(i),stack,top);
           }
        }
        while (!isEmpty(top)){
            top=pop(stack,top);
        }

    }
    private static boolean isEmpty(int top){
        if (top==-1){
            return  true;
        }return false;
    }

    private static int pop(char[] stack, int top) {
        System.out.print(stack[top]);
        top--;
        return top;
    }

    private static void display(char[] stack, int top) {
        for (int i = top; i >=0 ; i--) {

            System.out.print(stack[i]);
        }
    }

    private static int push(char charAt, char[] stack, int top) {

        top++;
        stack[top]=charAt;
        return top;
    }
}
