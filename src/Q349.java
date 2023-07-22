import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Q349 {
    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            l1.add(nums1[i]);
        }
        for (int j = 0; j < nums2.length; j++) {
            if (l1.contains(nums2[j])) {
                set.add(nums2[j]);
            }
        }
        int n = set.size();
        int[] ans = new int[n];
        int k = 0;
        for (int x :
                set) {
            ans[k++] = x;

        }
        System.out.println("array:" + Arrays.toString(ans));
        System.out.println("set " + set);
        System.out.println(l1);
        System.out.println("l2 " + l2);


//        int[] merge=new int[nums1.length+nums2.length];
//        int var=nums1.length;
//        int[] ans=new int[]{};
//        HashSet<Integer> set1=new HashSet<>();
//        HashSet<Integer> set2=new HashSet<>();
//
//        for (int i = 0; i < nums1.length; i++) {
//            merge[i]=nums1[i];
//        }
//        for (int i = 0; i < nums2.length; i++) {
//            if (!set1.contains(nums2[i])){
//
//            }
//            merge[var++]=nums2[i];
//        }
//        System.out.println(Arrays.toString(merge));


    }
}
