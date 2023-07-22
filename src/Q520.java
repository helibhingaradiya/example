public class Q520 {
    public static void main(String[] args) {
        String word="USaA";
        char[] arr=word.toCharArray();
        for (int i = 0; i < word.length(); i++) {
            int p=0;
            if (Character.isUpperCase(word.charAt(p))){
                System.out.println("true");
            }
            p++;
        }

    }
}
