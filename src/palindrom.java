import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int num=sc.nextInt();
        int num=121;
        int sum=0;
        int n=num;
        while(num > 0){
            int mod=num%10;
            sum= (sum*10)+mod;
            num=num/10;
        }

        if(sum == n){
            System.out.println("palindrom");
        }
        else {
            System.out.println("not");
        }
//        int r,sum=0,temp;
//        int n=454;//It is the number variable to be checked for palindrome
//
//        temp=n;
//        while(n>0){
//            r=n%10;  //getting remainder
//            sum=(sum*10)+r;
//            n=n/10;
//        }
//        if(temp==sum)
//            System.out.println("palindrome number ");
//        else
//            System.out.println("not palindrome");
//
}
}
