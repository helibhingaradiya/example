public class inventedtria {
    public static void main(String[] args) {
        int n=4;
        for (int i=1;i<=n;i++){
            for (int m=1;m<=n-i;m++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
