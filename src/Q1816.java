public class Q1816 {
    public static void main(String[] args) {
        String s="Hello how are you Contestant";
        int k=4;
        String[] arr=s.split(" ");
        String ans="";
        int i=0;
        for (; i < k-1; i++) {
             ans+=arr[i];
             ans+=" ";

        }
        ans+=arr[i];
        System.out.println(ans);
    }
}
