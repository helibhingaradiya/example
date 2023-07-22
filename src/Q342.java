public class Q342 {
    public static void main(String[] args) {
      int n=5;
        System.out.println(isPowerOfFour(n));
    }
    public static boolean isPowerOfFour(int n) {
      if (powerFour(n)==0) {
          return true;
      }
      return false;
    }
    public static int powerFour(int n){
        while (n>0){
            if (powerFour(n-4)%4==0){
              break;
            }
        }

        return 0;
    }
}
