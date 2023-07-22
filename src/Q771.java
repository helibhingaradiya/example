import java.util.ArrayList;
import java.util.List;

public class Q771 {
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        char[] arr = jewels.toCharArray();
        char[] arr2 = stones.toCharArray();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr[i]==arr2[j]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

