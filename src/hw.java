import java.util.Scanner;

public class hw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your array size");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("your array elements are:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("print array");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
        System.out.println("print array in reverse order");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
        System.out.println("enter number which you want for search");
        int num = sc.nextInt();
        boolean bool = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                bool = true;
                break;
            } else {
                bool = false;

            }
        }
        if (bool) {
            System.out.println("your number is " + num);

        } else {
            System.out.println("this number does not exist");

        }

        //odd even
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print("even number is: ");
                System.out.println(array[i]);
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print("odd number is: ");
                System.out.println(array[i]);
            }

        }

    }
}
