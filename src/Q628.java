public class Q628 {
    public static void main(String[] args) {
        int[] nums = {-100,-98,-1,2,3,4};
        System.out.println(maximumProduct(nums));
    }

    public static int maximumProduct(int[] nums) {
        int first=nums[0]*nums[1]*nums[2];
        int second=nums[nums.length-3]*nums[nums.length-2]*nums[nums.length-1];
        if(first>second){
            return first;
        }
        return second;
    }
}
