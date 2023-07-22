public class Removevowels {
    public static void main(String[] args) {

        String str="i am helly";
        String s1=" ";
        char[] s=str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){

            }else {
                s1+=str.charAt(i);
            }
        }
        System.out.println(s1);
    }
}
