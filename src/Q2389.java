import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q2389 {
    public static void main(String[] args) {
        int[] nums = {4, 5, 2, 1};
        int[] queries = {3, 10, 21};
        System.out.println(Arrays.toString(answerQueries(nums, queries)));
    }

    public static int[] answerQueries(int[] nums, int[] queries) {
        int n = nums.length;
        int m = queries.length;
        int[] answer = new int[m];

        // sort nums in non-decreasing order
        Arrays.sort(nums);

        // for each query, find the maximum size of a subsequence that has a sum less than or equal to the query
        for (int i = 0; i < m; i++) {
            int query = queries[i];
            int sum = 0;
            int size = 0;
            for (int j = 0; j < n; j++) {
                sum += nums[j];
                if (sum > query) {
                    break;
                }
                size++;
            }
            answer[i] = size;
        }

        return answer;


//        int[] ans = new int[queries.length];
//        Arrays.sort(nums);
//
//        for (int i = 0; i < queries.length; i++) {
//            int q=queries[i];
//            int sum=0;
//            int size=0;
//            for (int j = 0; j < nums.length; j++) {
//               sum+=nums[j];
//               if (sum>q){
//                   break;
//               }
//               size++;
//            }
//            ans[i]=sum;
//        }
//        return ans;
    }
}
