import java.util.HashMap;
import java.util.LinkedHashMap;

public class Q1370 {
    public static void main(String[] args) {
        String s = "aaaabbbbcccc";

        System.out.println(sortString(s));
    }

    public static String sortString(String s) {
        HashMap<Character,Integer> map=new LinkedHashMap<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
        }
        System.out.println(sb);
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        System.out.println(map);
        for(char ch:map.keySet()){

        }
        return sb.toString();
    }
}
