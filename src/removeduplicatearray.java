import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class removeduplicatearray {
    public static void removeDup(int[] array) {
        int front=0;
        int end=array.length/2;

        while (front < end){
            int mid=(front+end)/2;
            if (front > array[mid]){
                front=mid+1;
            }else {
                end=mid-1;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your array size");
        int size=sc.nextInt();

        int[] array = new int[size];
        System.out.println("enter your array elemets");
        for (int i=0;i<size;i++){
            array[i]=sc.nextInt();
            System.out.println(array[i]);
        }
        removeDup(array);
    }
}
