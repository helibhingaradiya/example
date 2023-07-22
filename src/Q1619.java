import java.util.Arrays;

public class Q1619 {
    public static void main(String[] args) {
        int[] arr={6,0,7,0,7,5,7,8,3,4,0,7,8,1,6,8,1,1,2,4,8,1,9,5,4,3,8,5,10,8,6,6,1,0,6,10,8,2,3,4};
        Arrays.sort(arr);

        int sum=0;
        float  div = 0;
        int i=arr.length*5;
        int m=i/100;

        for ( i = m; i <arr.length-m; i++) {
             sum+=arr[i];
        }
        i-=m;

        div=sum/i ;
        double ans=172/36;
        System.out.println(ans);
        System.out.println(div);

    }
}
