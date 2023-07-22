import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Q500 {
    public static void main(String[] args) {
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
        System.out.println(Arrays.toString(findWords(words)));
    }

    public static String[] findWords(String[] words) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            String s = words[i];
            int count1 = 0, count2 = 0, count3 = 0;
            for (int j = 0; j < s.length(); j++) {
                char ch = Character.toLowerCase(s.charAt(j));
                String str = String.valueOf(ch);
                if ("qwertyuiop".contains(str)) count1++;
                else if ("asdfghjkl".contains(str)) count2++;
                else if ("zxcvbnm".contains(str)) count3++;

            }
            if (count1 == s.length() || count2 == s.length() || count3 == s.length()) {
                list.add(s);
            }

        }
        String ans[] = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}
