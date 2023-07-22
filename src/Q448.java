import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Q448 {
    public static void main(String[] args) {
        int[] nums={1,1};
        Arrays.sort(nums);
        int len=nums.length;
        int sum=(len*(len+1))/2;
        HashSet<Integer> set=new HashSet<>();
        List<Integer> list1=new ArrayList<>();
        for (int i=0;i<nums.length;i++){
                set.add(nums[i]);
        }
        for (int i=1;i<=len;i++) {
            if(set.contains(i)){
            }else {
                list1.add(i);
            }
        }
        System.out.println(set);
        System.out.println(list1);
        System.out.println(sum);
    }
}
