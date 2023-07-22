import java.util.Arrays;
import java.util.HashSet;

public class Q2465 {
    public static void main(String[] args) {
        int[] nums = {9,5,7,8,7,9,8,2,0,7};
        Arrays.sort(nums);
        System.out.println(distinctAverages(nums));
    }

    public static int distinctAverages(int[] nums) {
        HashSet<Double> set = new HashSet<>();
        int front = 0;
        int end = nums.length - 1;
        while (front<=end){
            double sum=nums[front]+nums[end];
            double avg=sum/2;
            set.add(avg);
            front++;
            end--;
        }
            return set.size();
    }
}
