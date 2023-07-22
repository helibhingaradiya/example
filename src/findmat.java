import java.util.Scanner;

public class findmat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] num=new int[row][col];
        for (int i=0;i<row;i++)
        {
            for (int j=0;j<col;j++){
                num[i][j]=sc.nextInt();
            }
        }
//       int rowin=sc.nextInt();
        int colin=sc.nextInt();
        for (int i=0;i<row;i++)
        {
            for (int j=0;j<col;j++){
                if(num[i][j] == colin){
                    System.out.println("element found in"+ i + "and"+j );
                }

            }
        }
    }
}
