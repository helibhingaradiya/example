import java.util.*;

public class Q1002 {
    public static void main(String[] args) {
        String[] words = {"bella", "label", "roller"};
        System.out.println(commonChars(words));
    }

    public static List<String> commonChars(String[] words) {
        List<String> ans = new ArrayList<>();
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                map.put(words[i].charAt(j),map.getOrDefault(words[i].charAt(j),0)+1);
            }
        }

        for (Map.Entry<Character,Integer> kv : map.entrySet()){
            if (kv.getValue() % words.length == 0 ){
                for(int i = 0; i < kv.getValue() / words.length; i++){
                    ans.add(kv.getKey().toString());
                }
            }
        }

        return ans;
    }
}
