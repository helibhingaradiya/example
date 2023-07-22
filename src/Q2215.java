import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Q2215 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,3};
        int[] nums2 = {1,1,2,2};
        System.out.println(findDifference(nums1, nums2));
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> list = new ArrayList<>(2);
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        List<Integer> list3=new ArrayList<>();
        List<Integer> list4=new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
               set2.add(nums2[i]);
        }
        for (int i = 0; i < nums1.length; i++) {
            if (!set2.contains(nums1[i]) && (!list3.contains(nums1[i]))){
                list3.add(nums1[i]);
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            if (!set1.contains(nums2[i]) && (!list4.contains(nums2[i]))){
                list4.add(nums2[i]);
            }
        }

        list.add(list3);
        list.add(list4);

        return list;
    }
}
