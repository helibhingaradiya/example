import java.util.ArrayList;
import java.util.List;

public class Q1431 {
    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }

        int sum = 0;
        List<Boolean> list = new ArrayList<>();
        int extra = 3;
        for (int i = 0; i < candies.length; i++) {
            sum = candies[i] + extra;
            if (sum >= max) {
                list.add(true);
            } else {
                list.add(false);
            }

        }
        System.out.println(list);

    }
}
