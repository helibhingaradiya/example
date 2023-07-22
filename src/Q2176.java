public class Q2176 {
    public static void main(String[] args) {
        int[] nums={3,1,2,2,2,1,3};
        int k=2;
   int count=0;
   int mul=1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (i*j%k==0 && nums[i]==nums[j]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
