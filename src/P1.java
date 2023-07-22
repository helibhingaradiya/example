public class P1 {
    public static void main(String[] args) {
        int n=5;
        //space
        for (int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                System.out.print(" ");
            }
            for (int j=5;j>i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
//        for (int i=0;i<n;i++){
//
//            System.out.println();
//        }
    }
}
