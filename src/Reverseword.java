import java.util.Arrays;

public class Reverseword {
    public static void main(String[] args) {
        String S = "pqr.mno.cf.gf";
        String[] strarr = S.split("\\.",S.length());
        String x = "";
//        System.out.println(Arrays.toString(strarr));
        for (int i = 0; i < strarr.length; i++) {
            if(i==0){

                x = strarr[i] + x;

            }

            else{

                x = strarr[i] + '.' + x;

            }

        }

        System.out.println(x);

    }
}
