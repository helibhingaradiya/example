import java.util.HashMap;

public class Q1832 {
    public static void main(String[] args) {
        String sentence="thequickbrownfoxjumpsover";
        char[] arr=sentence.toCharArray();
        HashMap<Character,Integer> map=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
      if (map.size()==26){
          System.out.println("true");
          return;
      }
        System.out.println("false");
        System.out.println(map.size());
    }
}
