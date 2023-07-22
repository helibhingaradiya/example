import java.util.Scanner;
public class findarrayindex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your array size");

        int size=sc.nextInt();
        int[] num= new int[size];
        for (int j=0;j<size;j++){
            System.out.println("enter your arrays elements:");
            num[j]=sc.nextInt();
        }

        for (int i=0;i<size;i++){
            System.out.println("your array elemts are:"+num[i]+" ");

        }
        int in=sc.nextInt();
        for (int l=0;l<num.length;l++){
            if(num[l]==in){
                System.out.println("your index is:");
                System.out.println(l);
            }
        }
    }
}
