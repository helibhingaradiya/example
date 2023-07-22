public class Alanwalker {
    public static void main(String[] args) {
        int n = 6;
        int m = 5;
//        for (int i = 1; i <= n; i++) {
//            //space
//            for (int j = 0; j < 6 - i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= m; j++) {
//                if (i == 1 || j == 1 || i == n || j == m) {
//
//
//                  System.out.print("* ");
//                }else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
        for (int i = 0; i < 7; i++) {
            //space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <7-i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 7-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
