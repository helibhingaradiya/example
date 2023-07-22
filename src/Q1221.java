public class Q1221 {
    public static void main(String[] args) {
        String s = "RLRRLLRLRL";
        char[] arr = s.toCharArray();
        int pair = 0;
        int l = 0;
        int r = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'L') {
                l++;
            } else {
                r++;
            }
            if (l==r){
                pair++;
                l=0;
                r=0;
            }
        }
        System.out.println(pair);
    }
}
