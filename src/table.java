import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number:");

        int in=sc.nextInt();
//        int t=1;
        for (int i=1;i<11;i++){
//            System.out.println("your answer is:");
            System.out.println(in*i);
        }

    }
}
