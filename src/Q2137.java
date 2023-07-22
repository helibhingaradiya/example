import java.util.Arrays;

public class Q2137 {
    public static void main(String[] args) {
        String s="abcdefghi";
        int k=3;
        String[] ans=new String[k];
        char fill='x';
        for (int i = 0; i < s.length(); i++) {
            int front=0;
            while (front<k)
            {
                ans[i]= String.valueOf(s.charAt(front++));
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
