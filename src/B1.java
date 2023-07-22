public class B1 {
    public static void main(String[] args) {
        int[] nums = {1, 5, 4, 3, 7, 8};
        int target = 7;
        int front = 0;
        int end = nums.length;
        while (front <= end) {
         int mid=front+(end-front)/2;
         if (nums[mid]==target){
             System.out.println(nums[mid]);
         }
         if(target<nums[mid]){
             end=mid-1;
         }else{
             front=mid+1;
         }
        }
    }
}
