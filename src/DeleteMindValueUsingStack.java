import java.util.Stack;

public class DeleteMindValueUsingStack {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.push(50);
        deleteMic(s1);
        deleteMic(s1);
        System.out.println(s1);
    }
    private static void deleteMic(Stack<Integer> s1) {
        int size = s1.size();
        Stack<Integer> s2 = new Stack<>();
        for(int i = 0; i < (size/2); i++){
            s2.push(s1.pop());
        }
        System.out.println(s1.pop());
        while (!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }
}
