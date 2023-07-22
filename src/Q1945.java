public class Q1945 {
    public static void main(String[] args) {
        String s = "iiii";
        int k = 1;
        System.out.println(getLucky(s, k));
    }

    public static int getLucky(String s, int k) {
        int ans = 0;
        StringBuilder a= new StringBuilder();
        char[] ch={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)==ch[i]){
                a.append(i);
            }
        }
        System.out.println(a);
        return ans;
    }
}
