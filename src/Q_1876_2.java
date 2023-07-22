import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;

public class Q_1876_2 {
    public static void main(String[] args) {
        String s = "aababcabc";
        System.out.println(countGoodSubstrings(s));
    }

    public static int countGoodSubstrings(String s) {
        int count = 0;
        for (int i = 0; i < s.length()-2; i++) {
            char ch=s.charAt(i);
            String str = "";
            str+=ch;
            for (int j = 1; j < 3; j++) {
                str += s.charAt(i+j);
            }

            int c = 0;
            HashMap<Character,Integer> map=new HashMap<>();
            for (int j = 0; j < str.length(); j++) {
                map.put(str.charAt(j),map.getOrDefault(str.charAt(j),0)+1);
            }
            for (Map.Entry<Character,Integer> mp:map.entrySet()) {
                if (mp.getValue()==1){
                    c++;
                }

            }
            if (c == 3 ) {
                count++;
            }

        }
        return count;
    }
}
