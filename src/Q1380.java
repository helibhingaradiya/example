import java.util.ArrayList;
import java.util.List;

public class Q1380 {
    public static void main(String[] args) {
        int[][] matrix = {{1,10,4,2},{9,3,8,7},{15,16,17,12}};
        System.out.println(luckyNumbers(matrix));
    }

    public static List<Integer> luckyNumbers(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < row; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < col; j++) {
                if (min > matrix[i][j]) {
                    min = matrix[i][j];
                }

            }
            list1.add(min);

        }
        for (int i = 0; i < col; i++) {
            int max = Integer.MIN_VALUE;

            for (int j = 0; j < row; j++) {
                if (max < matrix[j][i]) {
                    max = matrix[j][i];
                }
            }
            list2.add(max);


        }
        for (int i = 0; i < list1.size(); i++) {
            if (list2.contains(list1.get(i))){
                list.add(list1.get(i));
            }
        }
        System.out.println(list2);
        System.out.println(list1);
        System.out.println(list);
        return list;
    }
}
