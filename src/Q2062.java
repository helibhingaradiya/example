import java.util.HashMap;

public class Q2062 {
    public static void main(String[] args) {
        String word = "aeiouu";
        System.out.println(countVowelSubstrings(word));

    }

    public static int countVowelSubstrings(String word) {
        HashMap<Character,Integer> map=new HashMap<>();
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            map.put(word.charAt(i),map.getOrDefault(word.charAt(i),0)+1);
        }
        return count;
    }
}
