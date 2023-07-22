public class Q1662 {
    public static void main(String[] args) {
        String[] word1={"ab", "c","d"};
        String[] word2={"a", "bc"};
        int front=0;
        String str = " ";
        String str2=" ";
        for (int i = 0; i < word1.length; i++) {
            str+=word1[i];
        }
        for (int i = 0; i < word2.length; i++) {
            str2+=word2[i];
        }
        if (str.equals(str2)){
            System.out.println(true);
        }
        System.out.println(str2);
    }
}
