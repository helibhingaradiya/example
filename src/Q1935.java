import java.util.HashMap;
import java.util.Map;

public class Q1935 {
    public static void main(String[] args) {
        String text = "hello world";
        String brokenLetters = "ad";
        System.out.println(canBeTypedWords(text, brokenLetters));
    }

    public static int canBeTypedWords(String text, String brokenLetters) {
        int count = 0;
        HashMap<Character,Integer> map=new HashMap<>();
        for (int i = 0; i < brokenLetters.length(); i++) {
            map.put(brokenLetters.charAt(i),i);
        }
        String[] arr=text.split(" ");
        for (int j = 0; j < arr.length ; j++){
            int counter = 0;
            for (int i = 0; i < arr[j].length(); i++) {
                if (map.containsKey(arr[j].charAt(i))){
                    counter++;
                }
            }
            if (counter == 0){
                count++;
            }
        }
        return count;
    }
}
