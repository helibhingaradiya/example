public class Q509 {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(fib(n));
    }

    public static int fib(int n) {
        int ans = 0;
        if (n<=1){
            return n;
        }
       return fib(n-1)+fib(n-2);

    }

}
