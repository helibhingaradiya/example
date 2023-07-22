import java.util.HashMap;

public class Q2506 {
    public static void main(String[] args) {
        String[] words = {"aba", "aabb", "abcd", "bac", "aabc"};
        System.out.println(similarPairs(words));
    }

    public static int similarPairs(String[] words) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            HashMap<Character,Integer> map=new HashMap<>();
            String str=words[i];
            for (int j = 0; j < str.length(); j++) {
                map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
            }
            System.out.println(map);

        }
        return count;
    }
}
