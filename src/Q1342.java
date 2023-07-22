public class Q1342 {
    public static void main(String[] args) {
        int num = 14;
        System.out.println(numberOfSteps(num));
    }

    public static int numberOfSteps(int num) {
        int ans = 0;
        while (num!=0){
            if (num%2==0){
                num/=2;
                ans++;
            }else {
                num-=1;
                ans++;
            }
        }
        return ans;
    }
}
