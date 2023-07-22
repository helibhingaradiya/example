import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Q2089 {
    public static void main(String[] args) {
        int[] nums={1,2,5,2,3};
        int target=2;

        Arrays.sort(nums);
        List<Integer> set=new ArrayList<>();
        for (int i=0;i<nums.length;i++){
              if (target==nums[i] ){
                  set.add(i);
              }
        }
        System.out.println(set);
    }
}
