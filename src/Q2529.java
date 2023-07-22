public class Q2529 {
    public static void main(String[] args) {
        int nums[] = {-2, -1, -1, 1, 2, 3};
        System.out.println(maximumCount(nums));
    }
    public static int maximumCount(int[] nums) {
        int countpos = 0;
        int countneg = 0;
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]<0){
                countneg++;
            }
            if (nums[i]>0){
                countpos++;
            }
        }
        if (countneg>countpos){
            return countneg;
        }
        return countpos;

    }
}
