public class Q2562 {
    public static void main(String[] args) {
        int[] nums = {5,14,13,8,12};
        System.out.println(findTheArrayConcVal(nums));
    }

    public static long findTheArrayConcVal(int[] nums) {
        long ans=0;
        int f=0;
        int l=nums.length-1;
        while (f<=l){
       String str1=Integer.toString(nums[f])+Integer.toString(nums[l]);
       ans+=Integer.parseInt(str1);
       f++;
       l--;
        }
        return ans;
    }
}
