public class Q1323 {
    public static void main(String[] args) {
        int num=6996;

        while (num>0){
            int mod=num%10;
            if (mod==6){
                mod=9;
            }else {
                mod=6;
            }
            System.out.println(mod);
            num=num/10;
        }

    }
}
