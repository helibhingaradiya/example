public class hollorombas {
    public static void main(String[] args) {
        // hollow rombus
//        int n=5;
//        int m=5;
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for (int j=1;j<=m;j++){
//               if(i == 1 || j == 1 || i == n || j == m){
//                   System.out.print("*");
//               }
//               else{
//                   System.out.print(" ");
//               }
//
//            }
//            System.out.println();
//        }
        //numbers pyramid

//        int n=5;
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for (int j=1;j<=i;j++){
//                System.out.print(i + " ");
//            }
//            System.out.println();
//        }
        //palindromic pattern
//        int n=5;
//          for (int i=1;i<=n;i++){
//              //space
//              for (int j=1;j<=n-i;j++){
//                  System.out.print(" ");
//              }
//              //first part
//              for (int j=i;j>=1;j--){
//                  System.out.print(j);
//              }
//              //second part
//              for (int j=2;j<=i;j++){
//                  System.out.print(j);
//              }
//              System.out.println();
//          }
        //diomand
//        int n=4;
//        //uperpart
//        for (int i=1;i<=n;i++){
//            //space
//
//            for (int j=1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for (int j=i;j>=1;j--){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for (int i=n;i>=1;i--){
//            //space
//
//            for (int j=1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for (int j=i;j>=1;j--){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //hollow diomond
        int n=4;
        int m=4;

        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=m;j++){
                if( i == 1 || j == 1 || i == n || j == m){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
