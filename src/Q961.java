import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Q961 {
    public static void main(String[] args) {
        int[] nums={5,1,5,2,5,3,5,4};
        Arrays.sort(nums);
        HashSet<Integer> set=new HashSet<>();
        int i=0;
        for (i=0;i<nums.length-1;i++){
           if (nums[i]==nums[i+1]){
               System.out.println(nums[i+1]);
               break;
           }
        }
//        System.out.println(nums[i]);
    }
}
