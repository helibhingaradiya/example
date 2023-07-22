import java.util.Scanner;

public class fibonaci {
    public static void calculatfibo(int n) {
        int a=0;
        int b=1;
        int c;
        System.out.print(a+ " " + b + " ");
        for (int i=1;i<=n;i++){
            c=b;
            b=a+b;
            a=c;
            System.out.print(b+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
//        System.out.println("answer is:"+ calculatfibo(n));
        calculatfibo(n);

    }
}
