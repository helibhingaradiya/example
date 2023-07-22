import java.util.Arrays;

public class Q2586 {
    public static void main(String[] args) {
        String[] words = {"are","amy","u"};
        int left = 0;
        int right = 2;
        System.out.println(vowelStrings(words, left, right));

    }

    public static int vowelStrings(String[] words, int left, int right) {
        int ans = 0;
        for (int i = 0; i < words.length; i++) {
            String str=words[i];
            if (i>=left && i<=right){
                if ((str.charAt(0)=='a'||str.charAt(0)=='e'||str.charAt(0)=='i'||str.charAt(0)=='o'||str.charAt(0)=='u')&&(str.charAt(str.length()-1)=='a'||str.charAt(str.length()-1)=='e'||str.charAt(str.length()-1)=='i'||str.charAt(str.length()-1)=='o'||str.charAt(str.length()-1)=='u') ){
                    ans++;
                }else if(str.length()==1 &&(str.charAt(0)=='a'||str.charAt(0)=='e'||str.charAt(0)=='i'||str.charAt(0)=='o'||str.charAt(0)=='u')){
                    ans++;
                }
            }

        }
        return ans;
    }
}
