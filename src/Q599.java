import java.util.ArrayList;
import java.util.List;

public class Q599 {
    public static void main(String[] args) {
        String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list2 = {"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};
        System.out.println(findRestaurant(list1,list2));
    }

    public static String[] findRestaurant(String[] list1, String[] list2) {
        String[] ans = new String[1];
        int count=0;
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[i].equals(list2[j])){
                    int total=i+j;
                    list.add(total);
                }
            }
        }
        System.out.println(list);
        return ans;
    }
}
