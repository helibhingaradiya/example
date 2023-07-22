public class Hw3Q2 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int target=4;
        int front=0;
        int end=arr.length-1;
        int i=0;
        while (front<=end)
        {
            int mid=(front+end)/2;

            if(arr[mid]==target){
                System.out.println("element found in "+mid+" index ");
            }
            if (arr[mid]>target){
                end=mid-1;
            }else{
                front=mid+1;
            }
        }
    }
}
