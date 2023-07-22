import java.util.*;

public class Q884 {
    public static void main(String[] args) {
        String s1="this apple is sweet";
        String s2="this apple is sour";
        System.out.println(Arrays.toString(uncommonFromSentences(s1, s2)));
    }
    public static String[] uncommonFromSentences(String s1, String s2) {
        Map<String,Integer> map1=new HashMap<>();
        Map<String,Integer> map2=new HashMap<>();
        List<String> uncommon=new ArrayList<>();

        String[] a1=s1.split(" ");
        String[] a2=s2.split(" ");

        for (int i = 0; i < a1.length; i++) {
            map1.put(a1[i],map1.getOrDefault(a1[i],0)+1);
        }
        for (int i = 0; i < a2.length; i++) {
            map2.put(a2[i],map2.getOrDefault(a2[i],0)+1);
        }
        for (int i = 0; i < a1.length; i++) {
            if (!map2.containsKey(a1[i]) && map1.get(a1[i]) == 1) {
                uncommon.add(a1[i]);
            }
        }
        for (int i = 0; i < a2.length; i++) {
            if (!map1.containsKey(a2[i]) && map2.get(a2[i]) == 1){
                    uncommon.add(a2[i]);
            }
        }

        String[] ans = new String[uncommon.size()];
        for (int i = 0; i < ans.length; i++) ans[i] = uncommon.get(i);
        return ans;
    }
}
