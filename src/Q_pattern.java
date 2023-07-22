public class Q_pattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            //space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <=7; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for (int i = 6; i >0; i--) {
            //space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <=7; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
