public class Secondlarge {
    public static void main(String[] args) {
        int[] arr={1,4,5,7,8,9};
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max<arr[i]){
                max=arr[i];
            }
        }

        System.out.println(max);
        int max2=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==max) continue;
            if (max2<arr[i]){
                max2=arr[i];
            }

        }
        System.out.println(max2);
    }
}
