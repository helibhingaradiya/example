import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter number:");
//        int n=sc.nextInt();
//        int sum=0;
//        for (int i=0;i<=n;i++){
//            sum=sum+i;
//
//        }
//        System.out.println("your sum is:");
//        System.out.println(sum);
//   *
//  * *
// * * *
//* * * *
        int n=4;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
