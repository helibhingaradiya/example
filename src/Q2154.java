import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q2154 {
    public static void main(String[] args) {
        int[] nums = {5,3,6,1,12};
        int original = 3;
        System.out.println(findFinalValue(nums, original));
    }

    public static int findFinalValue(int[] nums, int original) {
//        int ans = original;
//        while (true){
//            boolean found = false;
//            for (int i = 0; i < nums.length; i++){
//                if(nums[i] == original){
//                    ans = original;
//                    original = original * 2;
//                    found=true;
//                    continue;
//                }
//            }
//            if (found==false){
//                return original;
//            }
//        }
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == original) {
//                int mul = 0;
//                mul = nums[i] * 2;
//                while (mul != nums[i]) {
//                    mul = mul * 2;
//                    ans=mul;
//                }
//
//            }
//
//        }
//        return ans;

//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < nums.length; i++) {
//            list.add(nums[i]);
//        }
//        int mul = 0;
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i) == original) {
//                mul = list.get(i) * 2;
//            }
//            if (list.get(i) == mul) {
//                return list.get(i);
//            }
//        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==original){
                original*=2;
            }
        }
        return original;
}
}
