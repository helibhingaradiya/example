import java.util.ArrayList;
import java.util.List;

public class Q2200 {
    public static void main(String[] args) {
   int[] nums={3,4,9,1,3,9,5};
   int key=9;
   int k=1;
        System.out.println(findKDistantIndices(nums,key,k));
    }
    public static List<Integer> findKDistantIndices(int[] nums, int key, int k) {
  List<Integer> list=new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                if (nums[j]==key){
                    if (Math.abs(i-j)<=k){
                        list.add(j);

                    }
                }
            }
        }
  return list;
    }
}
