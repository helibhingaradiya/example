import java.util.Stack;

public class Q1209 {
    public static void main(String[] args) {
        String s="deeedbbcccbdaa";
        int k=3;
        System.out.println(removeDuplicates(s,k));

    }
    public static String removeDuplicates(String s, int k) {
        Stack<Character> charSt=new Stack<>();
        Stack<Integer> countSt=new Stack<>();

        for(char ch:s.toCharArray()){
            if(charSt.size()>0 && charSt.peek()==ch) countSt.push(countSt.peek()+1);
            else countSt.push(1);

            charSt.push(ch);
            if(countSt.peek()==k){
                for(int i=0;i<k;i++){
                    charSt.pop();
                    countSt.pop();
                }
            }
        }

        StringBuilder sb=new StringBuilder();
        while(!charSt.isEmpty()) sb.append(charSt.pop());
        return sb.reverse().toString();
    }
}
