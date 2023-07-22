public class sqrt {
    public static void main(String[] args) {
        int x=25;
        int start=1;
        int end=x/2;
        if(x<2){
            System.out.println(x);
        }
        while (start<=end){
            int mid=(start+end)/2;
            if ((long) mid * mid > x){
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
    }
}
