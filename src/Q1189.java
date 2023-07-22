import java.util.HashMap;

public class Q1189 {
    public static void main(String[] args) {
        String text = "nlaebolko";
        System.out.println(maxNumberOfBalloons(text));
    }

    public static int maxNumberOfBalloons(String text) {
        int count = 0;
        String balloon="balloon";
        HashMap<Character,Integer> map=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        for (int i = 0; i < balloon.length(); i++) {
            map.put(balloon.charAt(i),map.getOrDefault(balloon.charAt(i),0)+1);
        }
        for (int i = 0; i < text.length(); i++) {
            map2.put(text.charAt(i),map2.getOrDefault(text.charAt(i),0)+1);
        }
      for(char ch:map2.keySet()){
//          if ()
      }
        System.out.println(map);
        System.out.println(map2);
        return count;
    }
}
