public class Q2057 {
    public static void main(String[] args) {
        int[] nums={4,3,2,1};
        int min=0;
        for (int i=0;i<nums.length;i++){
            if (i%10==nums[i]){
                System.out.println(i);
            }
        }
    }
}
