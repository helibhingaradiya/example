import java.util.Arrays;
public class Q345 {
    public static void main(String[] args) {
        String s = "Unglad, I tar a tidal gnu.";
        System.out.println(reverseVowels(s));
    }
    public static String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int f = 0;
        int se = s.length()-1;
        while (f < se) {

            if (((arr[f] != 'a')&& (arr[f] !='e')&& (arr[f] != 'i')&&( arr[f] != 'o')&& (arr[f] != 'u'))&&((arr[f] != 'A')&& (arr[f] !='E')&& (arr[f] != 'I')&&( arr[f] != 'O')&& (arr[f] != 'U'))) {
                f++;
            } else if ( ((arr[se] != 'a')&&( arr[se] != 'e')&& (arr[se] != 'i')&& (arr[se] != 'o')&&(arr[se] != 'u' ))&&((arr[se] != 'A')&& (arr[se] !='E')&& (arr[se] != 'I')&&( arr[se] != 'O')&& (arr[se] != 'U'))) {
                se--;
            }else  if ((arr[f]=='a'||arr[f]=='e'||arr[f]=='i'||arr[f]=='o'||arr[f]=='u'||arr[f]=='A'||arr[f]=='E'||arr[f]=='I'||arr[f]=='O'||arr[f]=='U') &&(arr[se]=='a'||arr[se]=='e'||arr[se]=='i'||arr[se]=='o'||arr[se]=='u'||arr[se]=='A'||arr[se]=='E'||arr[se]=='I'||arr[se]=='O'||arr[se]=='U')){
                char temp = arr[f];
                arr[f] = arr[se];
                arr[se] = temp;
                f++;
                se--;
            }
        }
        return new String(arr);
    }
}
