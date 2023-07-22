public class Q2520 {
    public static void main(String[] args) {
        int num = 1248;
        System.out.println(countDigits(num));
    }

    public static int countDigits(int num) {
      int ans=0;
      int temp=num;
        while (num!=0){
          int digit=num%10;
            num/=10;
          if (temp%digit==0){
              ans++;
          }
      }
      return ans;
    }
}
