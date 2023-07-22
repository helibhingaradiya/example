import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.*;

public class Q2085 {
    public static void main(String[] args) {
        String[] words1 = {"a", "ab"};
        String[] words2 = {"a", "a", "a", "ab"};
        System.out.println(countWords(words1, words2));

    }
    public static int countWords(String[] words1, String[] words2) {
        int count = 0;
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < words1.length; i++) {
            map1.put(words1[i], map1.getOrDefault(words1[i], 0) + 1);
        }
        for (int i = 0; i < words2.length; i++) {
            map2.put(words2[i], map2.getOrDefault(words2[i], 0) + 1);
        }

        for (Map.Entry<String,Integer> m:map1.entrySet()){
            if (m.getValue()==1 && map2.get(m.getKey())==1){
                if(map2.containsKey(m.getKey()) && map2.get(m.getKey())==1)
                {
                    count++;
                }
            }
        }
        return count;
    }
}
