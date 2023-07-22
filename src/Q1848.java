public class Q1848 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1,1,1,1,1,1};
        int target = 1;
        int start = 9;
        System.out.println(getMinDistance(nums, target, start));
    }

    public static int getMinDistance(int[] nums, int target, int start) {
        int ans = 0;
        System.out.println(nums.length);
        if (start==nums.length-1){
            return 0;
        }
        for (int i = 0;i<nums.length;i++) {
            if (nums[i] == target) {

                ans = Math.abs(i - start);
                break;
            }
        }

        return ans;
    }
}
