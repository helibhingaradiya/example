import java.util.Scanner;

public class Hw3Q1 {




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int i = 0;
        System.out.println("enter your choice(1. for insert,2. for print,3. for replace,4. for find)");
        int num = 0;
//        while (num != 6) {
//            System.out.println("1.inseret 2.print 3.replace 4.search 5.delete 6.exit");
//            num = sc.nextInt();
//            switch (num) {
//                case 1:
//                    System.out.println("insert ele: ");
//                    int ele = sc.nextInt();
//                    i = insert(arr, ele, i);
//                    break;
//                case 2:
//                    System.out.println("enter which index element you want to remove");
//                    i = remove(arr,i);
//                    break;
//
//                case 3:
//                    System.out.println("wich element want you replace ");
//                    int oldel = sc.nextInt();
//
//                    System.out.println("enter new elemet");
//                    int newel = sc.nextInt();
//                    replace(newel, oldel, arr);
//                    break;
//                case 4:
//                    System.out.println("enter element which you want find:");
//                    int elm = sc.nextInt();
//                    find(elm, arr);
//                    break;
//                case 5:
//                    print(arr, i);
//                    break;
//                case 6:
//                    System.out.println("exit");
//                    break;
//                default:
//                    System.out.println("select correct case");
//                    break;
//            }
//        }

    }

    public static int insert(int[] arr, int elem, int i) {
        arr[i] = elem;
        System.out.println(arr[i]);
        i++;
        return i;
    }

    public static void print(int[] arr, int i) {
        System.out.println(i);

        for (int p = 0; p < i; p++) {
            System.out.println(arr[p]);
        }

    }

    public static void replace(int newel, int oldel, int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (oldel == arr[i]) {
                arr[i] = newel;
            }
        }
    }

    public static void find(int elm, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elm) {
                System.out.println("your elemnt found at " + i + " index");
                return;
            }
        }
        System.out.println("your elemen not exist");
    }
    public static int remove(int[] arr,int i) {
        Scanner sc = new Scanner(System.in);
        int size=arr.length;
        int target=sc.nextInt();
        boolean con = false;
        int j = 0;
        for(; j < arr.length; j++){
            if(arr[j] == target) {
                con = true;
                break;
            }
        }
        for(int k = 0; k < arr.length - 1; k++){
            arr[k] = arr[k + 1];
        }
        System.out.println(i);
        return i--;
    }
}
