import java.util.Arrays;

public class Q1561 {
    public static void main(String[] args) {
   int[] piles={2,4,1,2,7,8};
        System.out.println(maxCoins(piles));
    }
    public static int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int pair=piles.length/3;
        int arr[]=new int[pair];
        System.out.println(pair);
        int idx=0;
        for (int i = pair; i < piles.length; i+=2) {
            arr[idx++]=piles[i];
        }
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }

        return sum;
    }
}
