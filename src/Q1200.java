import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q1200 {
    public static void main(String[] args) {
        int[] arr = {3,8,-10,23,19,-4,-14,27};
        Arrays.sort(arr);
        System.out.println(minimumAbsDifference(arr));
    }

    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> list = new ArrayList<>();
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length-1; i++) {
            int aans=arr[i+1]-arr[i];
        min=Math.min(aans,min);
        }
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (Math.abs(arr[i]-arr[j])<=min){
                    List <Integer> list1=new ArrayList<>();
                    list1.add(arr[i]);
                    list1.add(arr[j]);
                    list.add(list1);
                }
            }
        }
        return list;
    }
}
