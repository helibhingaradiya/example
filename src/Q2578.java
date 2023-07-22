import java.util.Arrays;

public class Q2578 {
    public static void main(String[] args) {
        int num = 4325;
        System.out.println(splitNum(num));
    }

    public static int splitNum(int num) {
        int ans = 0;
        String str = String.valueOf(num);
        char[] array = str.toCharArray();
        Arrays.sort(array);
        int[] arr=new int[str.length()];
       while (num!=0){
           int mod=num%10;

       }
        int f = 0;
        int l = array.length - 1;
        int max = Integer.MIN_VALUE;
        while (f < l) {
            int sum = array[f] +array[l];
            if (sum > max) {
                max = sum;
            }
            f++;
            l--;
        }
        System.out.println(array);
        return max;
    }
}
