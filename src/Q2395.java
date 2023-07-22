import java.util.HashMap;

public class Q2395 {
    public static void main(String[] args) {
        int[] nums={0,0};
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        for (int i = 0; i < nums.length-1; i++) {
            sum=nums[i]+nums[i+1];
            if (map.containsKey(sum)){
                System.out.println("true");
            }else {
                map.put(sum,1);
            }
        }
    }
}
