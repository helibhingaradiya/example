public class Q1768 {
    public static void main(String[] args) {
        String word1="abc";String word2="pqr";

        char[] a1=word1.toCharArray();
        char[] a2=word2.toCharArray();
        int p1=0;
        int p2=0;
        String ans=" ";

            while (p1< a1.length || p2< a2.length){
                if (p1<a1.length){
                    ans+=a1[p1];
                    p1++;
                }
                if (p2<a2.length){
                    ans+=a2[p2];
                    p2++;
                }

            }


        System.out.println(ans);
    }
}
