import java.util.HashMap;

public class Q2287 {
    public static void main(String[] args) {
        String s = "ilovecodingonleetcode";
        String target = "code";
        System.out.println(rearrangeCharacters(s, target));
    }

    public static int rearrangeCharacters(String s, String target) {
        int count = 0;
        HashMap<Character,Integer> map=new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        System.out.println(map);
        for (int i = 0; i < target.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (target.charAt(i)==s.charAt(j)){
                    count++;
                }
            }
        }
        System.out.println(count);
//        for (int i = 0; i < s.length(); i++) {
//            String str=s.substring(i,target.length());
//            if (str.equals(target)){
//                count++;
//            }
//        }
        return count;
    }
}
