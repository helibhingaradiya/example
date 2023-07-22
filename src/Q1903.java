import java.util.Arrays;

public class Q1903 {
    public static void main(String[] args) {
        String num = "52";
        System.out.println(largestOddNumber(num));
    }

    public static String largestOddNumber(String num) {
        String ans = "";
        int nums = Integer.parseInt(num);
        if (nums % 2 != 0) {
            return num;
        }
        for (int i = 0; i < num.length(); i++) {
            int n = Integer.valueOf(num.charAt(i)) - '0';
            if (n % 2 == 1) {
                ans += n;
            }
        }
        return ans;
    }
}
