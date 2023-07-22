import java.util.Arrays;

public class Q1833 {
    public static void main(String[] args) {
        int[] costs = {1, 3, 2, 4, 1};
        Arrays.sort(costs);
        int coins = 7;
        int count=0;
        for (int i = 0; i < costs.length ; i++) {
           if(costs[i]<=coins){
               count++;
               coins-=costs[i];
           }
        }
        System.out.println(count);
    }
}
