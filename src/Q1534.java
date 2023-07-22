public class Q1534 {
    public static void main(String[] args) {
        int[] arr = {3, 0, 1, 1, 9, 7};

        int a = 7;
        int b = 2;
        int c = 3;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if (Math.abs(arr[i] - arr[j]) <= a && Math.abs(arr[i] - arr[j]) <= b && Math.abs(arr[i] - arr[j]) >= c) {
                        count+= 1;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
