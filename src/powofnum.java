import java.util.Scanner;

public class powofnum {
    public static int pownum(int x,int n) {
        int pow=1;
        for (int i=1;i<x;i++){
            pow=pow * x;

        }
        return pow;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        System.out.println("calculation was:"+pownum(x,n));
    }
}
