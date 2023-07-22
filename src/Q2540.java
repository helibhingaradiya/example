import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Q2540 {
    public static void main(String[] args) {
        int nums1[] = {12,16,24,24,25,27,31,37,38,41,43,50,57,70,71,71,74,76,77,78};
        int num2[] = {5,5,9,11,12,17,20,34,36,51,61,68,70,79,85,87,88,90,91,97};
        System.out.println(getCommon(nums1, num2));
    }

    public static int getCommon(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set1 = new HashSet<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> map1 = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i], map.getOrDefault(nums1[i], 0) + 1);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (map.containsKey(nums2[i])) {
                map1.put(nums2[i], map.getOrDefault(nums2[i], 0) + 1);
            }
        }
        int arr[] = new int[map1.size()];
        int j = 0;
        for (Integer i : map1.keySet()) {
            arr[j++] = i;
        }
        if (map1.size()==0){
            return -1;
        }
        Arrays.sort(arr);
        return arr[0];
    }
}
