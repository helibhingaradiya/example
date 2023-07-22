import java.util.Scanner;
import java.util.Arrays;


public class countallnums {
//    public static void countnum(int[] num, int n) {
//        int count = 0;
//        int c2 = 0;
//        int c3 = 0;
//        for (int i = 0; i < n; i++) {
//            if (num[i] < 0) {
//
//
//                count++;
//
//            }
//            if (num[i] > 0) {
//                c2++;
//            }
//            if (num[i] == 0) {
//                c3++;
//            }
//        }
//        System.out.println("number nagative" + count);
//        System.out.println("number is positive" + c2);
//        System.out.println("zero" + c3);
//
//
//    }
//
//    public static void arrayin(int[] num) {
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i <= num.length; i++) {
//            num[i] = sc.nextInt();
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int size = sc.nextInt();
//        int[] arr = new int[size];
//        arrayin(arr);
//        countnum(arr, arr.length);
//    }


    public static void inputArr(int[] num) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
    }

    public static void printArr(int[] num, int size) {
        int count = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < size; i++) {
            if (num[i] > 0) {
                System.out.println("positive number is:");
                count++;
            }
            if (num[i] < 0) {
                System.out.println("negative number is:");
                count1++;
            }
            if (num[i] == 0) {
                System.out.println("zero are:");
                count2++;
            }
        }
        System.out.println(count);
        System.out.println(count1);
        System.out.println(count2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] myArr = new int[size];
        inputArr(myArr);
        printArr(myArr, myArr.length);
    }
}

