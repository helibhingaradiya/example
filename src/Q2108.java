public class Q2108 {
    public static void main(String[] args) {
        String[] words={"fgh","e","ada"};
        String ans="";
        for (int i = 0; i < words.length; i++) {
            boolean bool=true;
            String str=words[i];
            System.out.println(str.length());
            int front=0;
            int end=str.length()-1;
            while (front<end){
            if (str.charAt(front)!=str.charAt(end)) {
                bool=false;

            }
            front++;
            end--;
            }
            if (bool){
                System.out.println(str);
            }
        }
    }
}
