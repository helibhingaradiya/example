public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("helly");
        System.out.println(sb);
        System.out.println(sb.charAt(2));

        sb.setCharAt(3,'c');
        System.out.println(sb);

    }
}
