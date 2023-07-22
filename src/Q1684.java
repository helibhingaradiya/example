import java.util.HashSet;

public class Q1684 {
    public static void main(String[] args) {
        String allowed="ab";
        String[] words={"ad","bd","aaab","baa","badab"};
        System.out.println(countConsistentStrings(allowed,words));
    }
    public static int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> set=new HashSet<>();
        int count=0;
        for (int i = 0; i < allowed.length(); i++) {
            set.add(allowed.charAt(i));
        }
        for (int i = 0; i < words.length; i++) {
            String str=words[i];
           if (set.contains(str.charAt(i))){
               count++;
           }

        }
        return count;
    }
}
