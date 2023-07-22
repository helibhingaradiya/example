import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Q1365 {
    public static void main(String[] args) {
        int[] nums={8,1,2,2,3};
        int count=0;
        int in = 0;
        int[] ansaa=new int[nums.length];
//        HashSet<Integer> set=new HashSet<>();
        List<Integer> al = new ArrayList<>();
        for (int i=0;i<nums.length;i++){
            for (int j=0;j<nums.length;j++){
                if(j!=i){
                    if (nums[j]<nums[i]){
                        count++;
                    }
                }
            }
            System.out.println(count);
//            al.add(count);
            ansaa[in++] = count;
            count = 0;
        }
        System.out.println(Arrays.toString(ansaa));

    }
}
