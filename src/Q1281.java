public class Q1281 {
    public static void main(String[] args) {
        int n = 234;
        int sum=0;
        int mul=1;
        int ans=0;
        while (n>0){
            int mod=n%10;
            sum+=mod;
            mul*=mod;

            n=n/10;
        }
        System.out.println(mul-sum);
    }
}
