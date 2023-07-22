public class Q2315 {
    public static void main(String[] args) {
        String s="l|*e*et|c**o|*de|";
        String[] str=s.split("\\|");
        int count=0;
        for (int i = 0; i < str.length; i+=2) {
            String ans=str[i];
            int p=0;
            while (p<=ans.length()-1){
                if (ans.charAt(p)=='*'){
                    count++;
                }
                p++;
            }
        }
        System.out.println(count);
    }
}
