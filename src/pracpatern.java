public class pracpatern {
    public static void main(String[] args) {
        int n=5;
        //upper
        for (int i=1;i<=n;i++){
            //first part
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            int s=2*(n-i);
            for (int j=1;j<=s;j++)
            {
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //lower
        for (int i=n;i>=1;i--){
            //first part
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            int s=2*(n-i);
            for (int j=1;j<=s;j++)
            {
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
