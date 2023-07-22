import java.util.Arrays;

public class CountFreq {
    public static void main(String[] args) {
//        String str = "sfgr etsssgte";
//        int[] arr=new int[128];
//            for (char ch:str.toCharArray()) {
//                arr[ch]++;
//            }
//        for (char ch:str.toCharArray()) {
//            System.out.println(ch+" "+arr[ch]);
//        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int[] arr = {1, 2, 3, 4, 1, 2, 3, 4, 8, 8,min, 50001, 8, 51, 8};
        for (int i : arr) max = Math.max(i, max);
        int[] freq = new int[max + 1];
        for (int i : arr) {
            freq[i]++;
        }
        for (int i : freq) {
            System.out.println(i + " " + freq[i]);
        }
    }
}
