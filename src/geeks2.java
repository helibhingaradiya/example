public class geeks2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int k = 4;
        int front = 0;
        int end = arr.length - 1;
        int i = 0;

        while (front <= end) {
            int mid = (front+end)/2;

            if (k < arr[mid]) {
                end = mid - 1;
                System.out.println(arr[i]);

            } else if(k>arr[mid]){
                front = mid + 1;
                System.out.println(arr[i]);


            }else if(k == arr[mid]){
                System.out.println(arr[i]);

            }
        }
    }
}
