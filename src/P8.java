public class P8 {
    public static void main(String[] args) {
        int temp=0;
        for (int i = 0; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                temp++;
                if (temp%2==1){
                    System.out.print(1);
                }
                else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
}
