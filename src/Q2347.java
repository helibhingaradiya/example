import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Q2347 {
    public static void main(String[] args) {
        int[] ranks = {12, 12, 12, 9, 9};
        char[] suits = {'b', 'd', 'a', 'c', 'b'};
        System.out.println(bestHand(ranks, suits));
    }

    public static String bestHand(int[] ranks, char[] suits) {
        String ans = "";
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < ranks.length; i++) {
            map.put(ranks[i], map.getOrDefault(ranks[i], 0) + 1);
        }
        for (int i = 0; i < suits.length; i++) {
            map2.put(suits[i], map2.getOrDefault(suits[i], 0) + 1);
        }

        for (int i : map2.values()) {
            if (i == 5) {
                return "Flush";
            }
        }

        for (int i:map.values()) {
            if (i>=3){
                return "Three of a Kind";
            }
        }
        for (int i:map.values()) {
            if (i==2){
                return "Pair";
            }
        }


//        if (map2.get(suits[0]) == suits.length) {
//            return "flush";
//        }
//        System.out.println(map);
//        for (Integer m : ranks) {
//
//        }
////        for (Map.Entry<Integer, Integer> it : map.entrySet()) {
////           if (it.getValue() == 3||it.getValue()==4) {
////                return "Three of a kind";
////            }
////            else if (it.getValue() == 2) {
////                return "Pair";
////            }
////        }
        return "High Card";
    }
}
