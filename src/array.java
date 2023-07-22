public class array {
    public static void main(String[] args) {
        int[] num = {10, 20, 30, 40, 50};
        int temp;
//int start=0;
        int end = num.length - 1;
        for (int start = 0; start <= end; start++) {
            temp = num[start];
            num[start] = num[end];
            num[end] = temp;
            end--;


        }
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
}
