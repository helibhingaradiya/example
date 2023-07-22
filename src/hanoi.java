public class hanoi {
    public static void printHnoi(int n, String src, String helper, String des) {
        if(n == 1){
            System.out.println("trsnsfer disk " + n + " from " + src + " to " + des);
            return;
        }
        printHnoi(n - 1, src, des, helper);
        System.out.println("trsnsfer disk " + n + " from " + src + " to " + des);
        printHnoi(n - 1, helper, src, des);
    }

    public static void main(String[] args) {
        int n = 2;
        printHnoi(n, "S", "H", "D");
    }
}
