import java.util.*;

public class Q2363 {
    public static void main(String[] args) {
        int[][] items1 = {{1, 1}, {4, 5}, {3, 8}};
        int[][] items2 = {{3, 1}, {1, 5}};
        for (int i = 0; i < items1.length; i++) {
            Arrays.sort(items1[i]);
        }

        for (int i = 0; i < items2.length; i++) {
            Arrays.sort(items2[i]);
        }
        System.out.println(mergeSimilarItems(items1, items2));

    }

    public static List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        List<List<Integer>> ans = new ArrayList<>();
        HashMap<Integer,Integer>  map=new HashMap<>();
        List list1=new ArrayList<>();

        for (int i = 0; i < items1.length || i<items2.length; i++) {
            for (int j = 0; j < items1[i].length||i<items2.length; j++) {

            }
        }

        System.out.println(list1);
        return ans;
    }
}
