import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Q1046 {
    public static void main(String[] args) {
        int[] stones = {2, 7, 4, 1, 8, 1};
        System.out.println(lastStoneWeight(stones));
    }

    public static int lastStoneWeight(int[] stones) {
        int ans = 0;
        List<Integer> list=new ArrayList<>();
//        Arrays.sort(stones);
        for (int i = 0; i < stones.length; i++) {
            list.add(stones[i]);
        }

        for (int i = list.size()-1; i >=0 ; i--) {
            if (list.get(i)== list.get(i+1)){
                list.remove(list.get(i));
                list.remove(list.get(i+1));
            }else {
                int var1=list.get(i);
                int var2=list.get(i+1);
                int a=var1-var2;
                list.add(a);
                list.remove(var1);
                list.remove((var2));
            }

        }
        System.out.println(list);
        return ans;
    }
}
