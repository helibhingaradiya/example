public class ReverseNUmber {
    public static void main(String[] args) {
        int num=1231;
        int mod=0;
        int n=0;
        while (num>0){
            mod=num%10;
            n=( n*10)+mod;
            num=num/10;
        }
        System.out.println(n);
    }
}
