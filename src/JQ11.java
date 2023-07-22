import java.util.HashSet;

public class JQ11 {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        int[] nums={1,2,2,3,5};
        int len=nums.length;
        int sum=(len*(len+1))/2;
        System.out.println(sum);
        for (int i=0;i<nums.length;i++){
          if (!set.contains(nums[i])){
              sum-=nums[i];
              set.add(nums[i]);
          }
        }
        System.out.println(sum);
    }
}
