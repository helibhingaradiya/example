public class numtria {
    public static void main(String[] args) {
        int n=5;
//        for(int i=1;i<=5;i++){
//            for (int j=1;j<=i;j++)
//            {
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

//        invented
//        12345
//        1234
//        123
//        12
//        1

//    for (int i=1;i<=n;i++){
//        for (int j=1;j<=n-i;j++){
//            System.out.print(j);
//        }
//        System.out.println();
//    }

        //      1
//              21
//             321
//            4321
//           54321
//        for (int i=1;i<=n;i++){
//            for (int m=1;m<=n-i;m++){
//                System.out.print(" ");
//            }
//            for (int j=i;j>=1;j--){
//                System.out.print(j);
//            }
//            System.out.println();
//        }

//        1
//        2 2
//        3 3 3
//        4 4 4 4
//        5 5 5 5 5
//        for (int i=1;i<=n;i++){
//            for (int m=1;m<=n-i;m++){
//                System.out.print(" ");
//            }
//            for (int j=i;j>=1;j--){
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }
//          1
//         2 3
//        4 5 6
//       7 8 9 10
//    11 12 13 14 15
//        int x=1;
//        for (int i=1;i<=n;i++){
//            for (int m=1;m<=n-i;m++){
//                System.out.print(" ");
//            }
//            for (int num=1;num<=i;num++){
//                System.out.print(x++ +" ");
//            }
//            System.out.println();
//        }
//int m=1;
//        for (int i=1;i<=3;i++)
//        {
//            for(int j=1;j<=3;j++){
//                System.out.print(m++);
//            }
//            System.out.println();
//        }
//int m=5;
//        for (int i=m-1;i>0;i--){
//
//            for(int j=i;j>0;j--){
//                System.out.print(i);
//            }
//            System.out.println();
//        }
//        int k=5;
//        for (int i=1;i<=k;i++){
//            for(int m=1;m<=k-i;m++)
//            {
//                System.out.print(" ");
//            }
//            for (int j=i;j>=1;j--){
//                System.out.print(j);
//            }
//            for (int j=2;j<=i;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//
//        }
//    *
//   * *
//  * * *
// * * * *
//* * * * *
//* * * * *
// * * * *
//  * * *
//   * *
//    *
//        int h=5;
//         for (int i=1;i<=h;i++){
//             for (int m=1;m<=h-i;m++){
//                 System.out.print(" ");
//             }
//             for (int j=1;j<=i;j++){
//                 System.out.print("*" + " ");
//             }
//            for(int s=1;s<=h+1;s++)
//            {
//                System.out.print("");
//            }
//            for (int j=i;j>=4;j--){
//                System.out.print("*");
//            }
//             System.out.println();
//         }

//        for (int i=h;i>=1;i--){
//            for (int m=h;m>i;m--)
//            {
//                System.out.print(" ");
//            }
//            for (int s=1;s<=i;s++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


        for (int i=1;i<=5;i++){
            for (int j=1;j<=5;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
