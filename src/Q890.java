import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q890 {
    public static void main(String[] args) {
        String[] words = {"abc", "deq", "mee", "aqq", "dkd", "ccc"};
        String pattern = "abb";
        System.out.println(findAndReplacePattern(words, pattern));
    }

    public static List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> list = new ArrayList<>();
        HashMap<Character,Integer> map1=new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            map1.put(pattern.charAt(i),map1.getOrDefault(pattern.charAt(i),0)+1);
        }
        System.out.println(map1);
        for (int i = 0; i < words.length; i++) {
            HashMap<Character,Integer> map=new HashMap<>();
             int size= words[i].length();
            for (int j = 0; j < size; j++) {

            }

            System.out.println();

        }
        return list;
    }
}
