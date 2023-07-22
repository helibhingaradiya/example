import java.util.Arrays;
import java.util.HashMap;

public class Q1309 {
    public static void main(String[] args) {
        String s = "10#11#12";
        System.out.println(freqAlphabets(s));
    }

    public static String freqAlphabets(String s) {
        String ans = "";
        String[] numbers=s.split("#");
        System.out.println(Arrays.toString(numbers));
        char[] ch = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        String[] num={"1","2","3","4","5","6","7","8","9","10#","11#","12#","13#","14#","15#","16#","17#","18#","19#","20#","21#","22#","23#","24#","25#","26#"};
        HashMap<Character, Integer> map = new HashMap<>();
        int count = 1;
        for (int i = 0; i < ch.length; i++) {
            map.put(ch[i], count);
            count++;
        }
        System.out.println(map);

        for (char c : map.keySet()) {
            if (map.get(c)==s.charAt(c)) {
                ans += map.get(c);
            }
        }
//        for (int i = 0; i < ch.length; i++) {
//            if (i==s.charAt(i)){
//
//            }
//        }
        return ans;
    }
}
