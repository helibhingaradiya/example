import java.util.Arrays;
import java.util.HashMap;

public class Q2418 {
    public static void main(String[] args) {
         String[] names={"Mary","John","Emma"};
         String[] ans=new String[names.length];
         int[] heights={180,165,170};

        HashMap<Integer,String> map=new HashMap<>();
        for (int i = 0; i < names.length; i++) {

                map.put(heights[i],names[i]);

        }
        Arrays.sort(heights);
        int index=0;
        for (int i = heights.length-1; i >=0 ; i--) {
            ans[index++]= map.get(heights[i]);
        }
        System.out.println(Arrays.toString(ans));
        System.out.println(map);
    }
}
