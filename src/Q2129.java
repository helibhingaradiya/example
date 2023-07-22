import java.util.Locale;

public class Q2129 {
    public static void main(String[] args) {
        String title="capiTalIze tHe titLe";
        String res="";
         title=title.toLowerCase();
        System.out.println(title);
        String[] arr=title.split(" ");
        for (int i = 0; i < arr.length; i++) {
            String str=arr[i];
            res += str.substring(0, 1).toUpperCase() + str.substring(1);

            if(i != arr.length){
                res+=" ";
            }
        }
        System.out.println(res);
    }
}
