import java.util.Arrays;

public class Q1859 {
    public static void main(String[] args) {
        String s="Myself2 Me1 I4 and3";
        String[] arr=s.split(" ");
        String[] ansarr=new  String[arr.length];
        String ans="";
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            String an=arr[i];
            char var=an.charAt(an.length()-1);
            int a = var - '0';
            ansarr[a - 1]=an.substring(0, an.length() - 1);
        }
        for (int i = 0; i < ansarr.length; i++) {
            ans+=ansarr[i];
            if (i<ansarr.length-1){
                ans+=" ";
            }
        }

        System.out.println(ans);
    }

}
