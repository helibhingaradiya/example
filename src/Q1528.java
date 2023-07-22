import java.util.Arrays;

public class Q1528 {
    public static void main(String[] args) {
        String str = "codeleet";
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};
        char[] ans = new char[str.length()];
        for (int i = 0; i < indices.length; i++) {
            ans[indices[i]]=str.charAt(i);
        }
        System.out.println(Arrays.toString(ans));
    }
}
