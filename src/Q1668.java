public class Q1668 {
    public static void main(String[] args) {
        String sequence = "ababc";
        String word = "ac";
        System.out.println(maxRepeating(sequence, word));
    }

    public static int maxRepeating(String sequence, String word) {
        String find="";
        while(sequence.contains(find)){
            find += word;
        }
        return (find.length()-word.length())/word.length();
    }
}
