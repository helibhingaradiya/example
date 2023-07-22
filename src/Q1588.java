public class Q1588 {
    public static void main(String[] args) {
        int[] arr={1,4,2,5,3};
        int ans=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j+=2) {
                for (int k = i; k <=j ; k++) {
                  ans+=arr[k];
                }
            }
        }

        System.out.println(ans);
    }
}
