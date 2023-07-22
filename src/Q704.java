public class Q704 {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int k = 9;
        int front = 0;
        int last = nums.length - 1;

      for (int i=0;i<nums.length;i++){
            int mid =(last + front) / 2;
            if (nums[mid] == k) {
                System.out.println(mid);
            }
            if (k > nums[mid]) {
                front = mid + 1;
            } else {
                last = mid - 1;
            }

        }
    }
}
