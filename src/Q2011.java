public class Q2011 {
    public static void main(String[] args) {
        String[] operation = {"--x", "x++", "++x"};
        int x = 0;
        for (int i = 0; i < operation.length; i++) {
            if (operation[i].equals("--x") || operation[i].equals("x--")) {
                x = x - 1;
            } else if (operation[i].equals("x++") || operation[i].equals("++x")) {
                x = x + 1;

            }
        }
        System.out.println(x);
    }
}
