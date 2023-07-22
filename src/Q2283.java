import java.util.HashMap;

public class Q2283 {
    public static void main(String[] args) {
        String num = "1210";
        System.out.println(digitCount(num));
    }

    public static boolean digitCount(String num) {
        char[] arr = num.toCharArray();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int temp = Integer.parseInt(String.valueOf(arr[i]));
            map.put(temp, map.getOrDefault(temp, 0) + 1);
        }
        for (int i = 0; i < arr.length; i++) {
            int temp = Integer.parseInt(String.valueOf(arr[i]));

            if (map.containsKey(i)) {
                if (map.get(i) != temp) {
                    return false;
                }
            } else if (!map.containsKey(i) && temp != 0) {
                return false;
            }
        }
        return true;
    }
}

