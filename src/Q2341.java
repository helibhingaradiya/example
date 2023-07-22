import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q2341 {
    public static void main(String[] args) {
   int[] nums={1,3,2,1,3,2,2};
        System.out.println(Arrays.toString(numberOfPairs(nums)));
    }

    public static int[] numberOfPairs(int[] nums) {
       int ans[]=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i <nums.length ; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int odd=0;
        int even=0;
       for(int i:map.keySet()){
         if (map.get(i)>2 && map.get(i)%2==0){
             even+=map.get(i)/2;
         } else if (map.get(i)>2 && map.get(i)%2!=0) {
             even+=(map.get(i)-1)/2;
             odd++;
         }
         if (map.get(i)==1){
             odd++;
         }

         if (map.get(i)==2){
             even++;
         }
       }
       ans[0]=even;
       ans[1]=odd;
     return ans;
    }
}
