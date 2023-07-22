import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Q443 {
    public static void main(String[] args) {
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        Arrays.sort(chars);
        System.out.println(compress(chars));
    }

    public static int compress(char[] chars) {
        int len = 0;
        HashMap<Character,Integer> map=new HashMap<>();
        HashSet<Character> set = new HashSet<Character>();
        int count = 0;
        String str = "";
        if (chars.length == 1) {
            return 1;
        }
        for (int i = 0; i < chars.length; i++) {
          map.put(chars[i],map.getOrDefault(chars[i],0)+1);
        }
        System.out.println(map);
        System.out.println(set);
        System.out.println(str);

        return map.size()*2;
    }
}
