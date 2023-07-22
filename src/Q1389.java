import java.util.ArrayList;
import java.util.Arrays;

public class Q1389 {
    public static void main(String[] args) {
        int[] nums={0,1,2,3,4};
        int[] index={0,1,2,2,1};
        int[] ans=new int[nums.length];
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {

                list.add(index[i],nums[i]);

        }
        for (int i = 0; i < list.size(); i++) {
            ans[i]=list.get(i);
        }
        System.out.println(list);
        System.out.println(Arrays.toString(ans));
    }
}
