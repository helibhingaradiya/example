import java.util.Arrays;

public class Q496 {
    public static void main(String[] args) {
   int[] nums1={4,1,2};
   int [] nums2={1,3,4,2};
        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
    }
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
     int[] ans=new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i]==nums2[j]){
                    for (int k = j; k <nums2.length ; k++) {
                        if (nums2[k]>nums1[i]){
                            ans[i]=nums2[k];
                            break;
                        }else {
                            ans[i]=-1;
                        }
                    }
                }
            }
        }
     return ans;
    }
}