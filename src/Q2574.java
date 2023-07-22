import java.util.Arrays;

public class Q2574 {
    public static void main(String[] args) {
        int[] nums = {10, 4, 8, 3};
        System.out.println(leftRigthDifference(nums));
    }

    public static int[] leftRigthDifference(int[] nums) {
        int[] answer = new int[nums.length];
        int sumleft=0;
        int sumright=0;
        int[] suml=new int[nums.length];
        int s1=0;
        int[] sumr=new int[nums.length];
        int s2=sumr.length-1;
        for (int i = 0; i < nums.length-1; i++) {
            sumleft+=nums[i];
            suml[++s1]=sumleft;
        }
        for (int i = nums.length-1; i >=0 ; i--) {
            sumr[s2--]=sumright;
            sumright+=nums[i];
        }
        for (int i = 0; i < suml.length; i++) {
            int ans=Math.abs(suml[i]-sumr[i]);
            answer[i]=ans;
        }
        System.out.println(Arrays.toString(suml));
        System.out.println(Arrays.toString(sumr));

        return answer;
    }
}
