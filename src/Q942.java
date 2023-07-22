import java.util.Arrays;

public class Q942 {
    public static void main(String[] args) {
        String s = "IDID";
        System.out.println(Arrays.toString(diStringMatch(s)));
    }

    public static int[] diStringMatch(String s) {
        int[] ans = new int[s.length() + 1];
        int start = 0;
        int end = s.length();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I') {
                ans[i] = start;
              start++;
            } else if (s.charAt(i) == 'D') {
                ans[i] = end;
                end--;
            }

        }
        ans[ans.length-1]=start;
        return ans;
    }
}
