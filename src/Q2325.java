import java.util.HashMap;

public class Q2325 {
    public static void main(String[] args) {
        String key="the quick brown fox jumps over the lazy dog";
        String message="vkbs bs t suepuv";
        System.out.println(decodeMessage(key,message));
    }
    public static String decodeMessage(String key, String message) {
        HashMap<Character,Character> mapKey=new HashMap<>();
        char[] ch={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        for (int i = 0; i < key.length(); i++) {
            mapKey.put(key.charAt(i),ch[i]);
            
        }
        System.out.println(mapKey);
        return "ttttt";
    }
}
