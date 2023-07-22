public class matrix {
    public static void main(String[] args) {
//        int[][] num={{1,2,3},{8,9,4},{7,6,5}};
//        for (int i=0;i<num.length ;i++){
//            for (int j = 0 ;j < num[i].length ;j++){
//                System.out.print(num[i][j]+ " ");
//            }
//
//            System.out.println();
//        }
        int[][] num={{1,2,3},{4,5,6}};
        for (int i=0;i<=num.length-1;i++){
            for (int j=0;j<=num[i].length-1;j++){
                System.out.print(num[i][j]);
            }
            System.out.println();
        }
    }
}
