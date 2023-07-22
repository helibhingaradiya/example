public class geeks1 {
    public static void main(String[] args) {
        int A[]={1,2,3,4,5};
        int n= A.length;
        int sum=0;
        float ans;
        for (int i=0;i<A.length;i++){
            sum+=A[i];

        }
        System.out.println(sum);
        System.out.println(ans=sum/n);
        String ans1=Float.toString(ans);
        System.out.println(ans1);
    }
}
