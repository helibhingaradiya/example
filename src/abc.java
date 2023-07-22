import java.util.Arrays;

public class abc {
    public static void main(String[] args) {
       int x=10;
       if (x>10) {
           x-=10;
       } else if (x>=0) {
           x+=00;
       }else {
           x-=10;
       }
        System.out.println(x);
       int arr1[] ={1,3,5,7,9};
       int[] arr2={2,4,6,8,10};
        System.out.println(Arrays.toString(merge(arr1, arr2)));
    }
    public static int[] merge(int[] arr1,int[] arr2){
        int[] ans=new int[arr1.length+arr2.length];
        int i=0;
        int j=0;
        int m=0;
        int n=1;
        while (i<arr1.length){
            ans[m]=arr1[i];
            m+=2;
            i++;
        }
        while (j<arr2.length){
            ans[n]=arr2[j];
            n+=2;
            j++;
        }
        return ans;
    }
}
