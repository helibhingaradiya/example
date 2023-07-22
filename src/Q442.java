import java.util.*;

public class Q442 {
    public static void main(String[] args) {
        int[] nums={4,3,2,7,8,2,3,1};
        HashMap<Integer,Integer> map=new HashMap<>();
        HashSet<Integer> set=new HashSet<>();
        for (int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for (Map.Entry<Integer,Integer> m:map.entrySet()){
            if (m.getValue()>1){
                set.add(m.getKey());
            }
        }
        System.out.println(set);
//        Arrays.sort(nums);
//        int count=0;
//        ArrayList<Integer> list=new ArrayList<>();
//        for (int i=0;i<nums.length-1;i++){
//            if (nums[i]==nums[i+1]){
//                list.add((nums[i]));
//            }
//        }
//        System.out.println(list);
    }
}
