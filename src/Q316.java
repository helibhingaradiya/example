import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class Q316 {
    public static void main(String[] args) {
        String s = "tree";
        System.out.println(removeDuplicateLetters(s));
    }

    public static String removeDuplicateLetters(String s) {
        String a = "";
        HashMap<Character,Integer> map=new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        System.out.println(map);

        return a;
//        Stack<Character> stk = new Stack();
//        char arr[]=s.toCharArray();
//        Arrays.sort(arr);
//        System.out.println(arr);
//        int l=0;
//        while (l<arr.length){
//            if (stk.isEmpty()){
//                stk.push(arr[l]);
//                s+=arr[l];
//            }else {
//                if (stk.peek()==arr[l]){
//                    stk.pop();
//                }else {
//                    stk.push(arr[l]);
//                    s+=arr[l];
//                }
//            }
//            l++;
//        }

    }
}
