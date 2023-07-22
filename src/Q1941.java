import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q1941 {
    public static void main(String[] args) {
        String s = "tveixwaeoezcf";
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        int[] arr = new int[map.size()];
        int j = 0;
        for (Map.Entry<Character, Integer> m : map.entrySet()) {
            arr[j++] = m.getValue();

        }
//        int front=0;
//        int end=1;
//        while (end< arr.length){
//            if (arr[front]==arr[end]){
//                System.out.println("true");
//            }
//            front++;
//            end++;
//        }
        for (int i = 0; i < arr.length-1; i++) {
            for (int k = i+1; k < arr.length ; k++) {
                if (arr[i]==arr[k]){
                    System.out.println("true");
                }
            }

        }
        System.out.println(Arrays.toString(arr));
        System.out.println(map);
    }
}
