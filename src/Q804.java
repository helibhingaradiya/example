import java.util.HashMap;

public class Q804 {
    public static void main(String[] args) {
        String[] words={"gin","zen","gig","msg"};
        String[] code={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashMap<String,Boolean> map=new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            String ans = "";

            for (int j = 0; j < words[i].length(); j++) {

                ans += code[words[i].charAt(j) - 'a'];
            }
            map.put(ans, true);

        }
        System.out.println(map.size());
    }
}
