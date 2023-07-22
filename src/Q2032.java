import java.util.*;

public class Q2032 {
    public static void main(String[] args) {

        int[] nums1={1,1,3,2};
        int[] nums2={2,3};
        int[] nums3={3};
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i <nums1.length ; i++) {
            list.add(nums1[i]);
        }
        for (int i = 0; i <nums2.length ; i++) {
            list.add(nums2[i]);
        }
        for (int i = 0; i <nums3.length ; i++) {
            list.add(nums3[i]);
        }


        for (int i = 0; i < list.size(); i++) {
          map.put(list.get(i),map.getOrDefault(list.get(i),0)+1 );
        }
        for (Map.Entry<Integer,Integer> m:map.entrySet()){
            m.getValue();
            if (m.getValue()>=2){
                list1.add(m.getKey());
            }
        }
        System.out.println(map);
        System.out.println(list1);

    }
}
