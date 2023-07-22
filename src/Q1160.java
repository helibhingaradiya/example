import java.util.HashMap;
import java.util.HashSet;

public class Q1160 {
    public static void main(String[] args) {
        String[] words = {"cat", "bt", "hat", "tree"};
        String chars = "atach";
        System.out.println(countCharacters(words, chars));
    }

    public static int countCharacters(String[] words, String chars) {
        int count = 0;
        HashMap<Character,Integer> map=new HashMap<>();
        for (int i = 0; i < chars.length(); i++) {
            map.put(chars.charAt(i),map.getOrDefault(chars.charAt(i),0)+1);
        }
        for (int i = 0; i < words.length; i++) {
            HashMap<Character,Integer> temp=new HashMap<>();
            for (int j = 0; j < words[i].length(); j++) {
                temp.put(words[i].charAt(j),temp.getOrDefault(words[i].charAt(j),0)+1);
            }

           for(char ch:map.keySet()){
               if (map.get(ch)==temp.get(ch)){
                   count+=words[i].length();
               }
           }

        }
        return count;
    }
}
