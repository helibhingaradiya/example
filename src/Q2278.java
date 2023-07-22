public class Q2278 {
    public static void main(String[] args) {
        String s="foobar";
        char letter='o';
        double count=0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)==letter){
                count++;
            }
        }
        System.out.println(count);
        System.out.println(s.length());
        double num = count / s.length()*100;
        int ans= (int) num;
        System.out.println(ans);

    }
}
