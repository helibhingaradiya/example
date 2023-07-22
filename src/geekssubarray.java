public class geekssubarray {
    public static void main(String[] args) {
        int[] arr = {1,1,2, 5, 7, 1};
        int target = 4;
        int len = arr.length;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = arr[i];
            for (int j = i + 1; j <= arr.length; i++) {
                if (sum == target) {
                    System.out.println(i);
                    System.out.println(j-1);
                }
                if (sum > target) {
                    break;
                }
                if (j < len) {
                    sum += arr[j];
                }
            }
        }
        System.out.println(sum);
//        int front=0;
//        int end=arr.length-1;
//        int target=6;
//        String str="ASDDDD";
//        str.toLowerCase();
//        int sum;
//        for (int i=0;i<arr.length-1;i++){
//            sum=arr[front]+arr[end];
//            if (sum==target){
//                System.out.println(front+" "+end);
//            }
//            if (sum>=target){
//                end--;
//            }else{
//                front++;
//            }
//        }
    }
}
