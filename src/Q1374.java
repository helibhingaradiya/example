public class Q1374 {
    public static void main(String[] args) {
        int n=4;

        System.out.println(n%2);
        int len=n%2;
//        char[] arr={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        String ans="";
        if (n==0){
            for (int i = 0; i < n; i++) {
                    ans+='a';
            }
        }else {
            for (int i = 0; i < n-1; i++)
                ans+='a';
                ans+='b';

        }


        System.out.println(ans);
    }
}
