import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] a1={1,2,3,4};
        int[] a2={5,6,7,8};
        int len=a1.length;
        int[] ans=new int[a1.length+ a2.length];
        for (int i = 0; i < a1.length; i++) {
            ans[i]=a1[i];
        }
        for (int i = 0; i < a2.length; i++) {
            ans[len++]=a2[i];
        }
        System.out.println(Arrays.toString(ans));
    }
}
