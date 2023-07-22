
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Q2248 {
    public static void main(String[] args) {
        int[][] nums={{3,1,2,4,5},{1,2,3,4},{3,4,5,6}};
        List<Integer> list=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                list.add(nums[i][j]);
                if (list.contains(nums[i][j])){
                    set.add(nums[i][j]);
                }
            }

        }
        System.out.println(set);
    }
}
