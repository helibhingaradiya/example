import java.util.Scanner;

public class eligibale {
    public static int validateage(int age) {
        if(age>=18){
            System.out.println("you are going for voting :) ");

        }else {
            System.out.println("you are not eligible");
        }
        return 1;



    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your age:");
        int age=sc.nextInt();
        validateage(age);
    }
}
