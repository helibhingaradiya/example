import java.util.Arrays;

public class Q819 {
    public static void main(String[] args) {
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = {"hit"};
        System.out.println(mostCommonWord(paragraph, banned));
    }

    public static String mostCommonWord(String paragraph, String[] banned) {
        String ans = "";
        String str="";
        String[] arr=paragraph.split(" ");
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < paragraph.length(); i++) {
            if (paragraph.charAt(i) ==' '){
            }else {
                 str+=paragraph.charAt(i);
                System.out.println(str);
            }
        }
        return ans;
    }
}
