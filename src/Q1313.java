import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Q1313 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < nums.length; i+=2) {
          int freq=nums[i];
          int val=nums[i+1];
            for (int j = 0; j < freq; j++) {
                list.add(val);
            }
        }
        int[] ans=new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i]= list.get(i);
        }
        System.out.println(list);
        System.out.println(Arrays.toString(ans));
    }
}
