import java.util.HashMap;

public class Q2068 {
    public static void main(String[] args) {
        String word1 = "aaaa";
        String word2 = "bccb";
        System.out.println(checkAlmostEquivalent(word1, word2));
    }

    public static boolean checkAlmostEquivalent(String word1, String word2) {
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        for (int i = 0; i < word1.length(); i++) {
            map1.put(word1.charAt(i),map1.getOrDefault(word1.charAt(i),0)+1);
        }
        for (int i = 0; i < word2.length(); i++) {
            map2.put(word2.charAt(i),map2.getOrDefault(word2.charAt(i),0)+1);
        }
        for (int i = 0; i < word1.length(); i++) {
//            if (map1.get(word2.charAt(i))>1 && map2.get(word1.charAt(i)) )
        }
        System.out.println(map1);
        System.out.println(map2);
        return false;
    }
}
