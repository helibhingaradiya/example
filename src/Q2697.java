public class Q2697 {
    public static void main(String[] args) {
        String s = "egcfe";
        System.out.println(makeSmallestPalindrome(s));

    }

    public static String makeSmallestPalindrome(String s) {
        int n=s.length();
        char arr[]=s.toCharArray();
        for (int i = 0; i < n/2; i++) {
            char ch= (char) Math.min(s.charAt(i),s.charAt(n-1-i));
          arr[i]=ch;
          arr[n-1-i]=ch;

        }

        return new String(arr);
    }
}
