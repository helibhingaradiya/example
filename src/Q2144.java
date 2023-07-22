import java.util.Arrays;
import java.util.Stack;

public class Q2144 {
    public static void main(String[] args) {
        int[] cost = {1,2,3};
        System.out.println(minimumCost(cost));
    }

    public static int minimumCost(int[] cost) {
        Stack<Integer> stk = new Stack<>();


        int sum = 0;
        Arrays.sort(cost);
        int last=cost.length-1;
        int seLast=last-1;
//        System.out.println(last);
//        System.out.println(seLast);
        while ( seLast>=0){
            int ans=cost[last]+cost[seLast];
            sum+=ans;
            last-=3;
            seLast-=3;
        }
        return sum;
    }
}
