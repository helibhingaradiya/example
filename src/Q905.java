public class Q905 {
    public static void main(String[] args) {
        int[] nums={3,1,2,4};
        int front=0;
        int end=nums.length-1;
        int temp=0;
      for (int i=0;i<nums.length;i++){

          if (nums[i]%2==0){
              temp=nums[front];
              nums[front]=nums[i];
              nums[i]=temp;
              front++;
          }
      }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
