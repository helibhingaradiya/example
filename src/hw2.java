import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        //print elements of array
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
////        reverse
//        for (int i = arr.length - 1; i > 0; i--) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//        //find elements
//        int e = 3;
//        for (int i = 0; i < arr.length - 1; i++) {
//            if (arr[i] == e) {
//                System.out.println("your element " + arr[i] + " found");
//            }
//        }
//        //odd even
//        for (int i = 0; i < arr.length - 1; i++) {
//            if (arr[i] % 2 == 0) {
//                System.out.print("even numbers:");
//                System.out.println(arr[i] + " ");
//            }
//        }
//        System.out.println();
//        for (int i = 0; i < arr.length - 1; i++) {
//            if (arr[i] % 2 != 0) {
//                System.out.print("odd numbers:");
//                System.out.println(arr[i] + " ");
//            }
//        }
//        System.out.println();
//        //replace elements
//        int newel = 10;
//
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == 4) {
//                arr[i] = newel;
//            }
//
//        }
//        // new array
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
        //delete elements
//        Scanner sc=new Scanner(System.in);
//        int loc=sc.nextInt();
        int loc = 2;
        int temp;
        int size = arr.length-1;
        for (int i = loc; i < size; i++) {

            arr[i] = arr[i + 1];


        }
        size--;
        // new array

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
