public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr={0,3,1,2,4,5};
        int target=1;
        int front=0;
        int end=arr.length-1;
        while (front<end){
            int mid=front+(end-front)/2;
            if (target==arr[mid]){
                System.out.println(arr[mid]);
            }
            if (target>arr[mid]){
                front=mid+1;
            }
            else {
                end=mid-1;
            }
        }
    }
}
