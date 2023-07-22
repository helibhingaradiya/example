public class Q2185 {
    public static void main(String[] args) {
        String[] words = {"pay","at","practice","attend"};
        String pref = "at";
        System.out.println(prefixCount(words,pref));
    }

    public static int prefixCount(String[] words, String pref) {
        int count = 0;
        for(String m:words){
            if(m.length() >= pref.length()){
                if (pref.matches(m.substring(0,pref.length()))){
                    count++;
                }
            }
        }
        return count;
    }

}
