import java.util.Arrays;

public class DynamicProgramming {
    public static void main(String[] args) {
     int n=18;
     int arr[]={7,5,1};
     int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        dp[0]=0;
        System.out.println(minCoinn(n,arr,dp));
    }

    static int minCoinn(int n, int arr[],int dp[]) {
        if (n == 0) return 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (n - arr[i] >= 0) {
                int subAns=0;
                if (dp[n-arr[i]]!=-1){
                        subAns=dp[n-arr[i]];
                }else {
                    subAns = minCoinn(n - arr[i], arr,dp);

                }
                if (subAns != Integer.MAX_VALUE && subAns + 1 < min) {
                    min = subAns + 1;
                }
            }
        }
        return dp[n]=min;
    }
}
