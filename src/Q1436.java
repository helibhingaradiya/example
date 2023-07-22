import java.util.ArrayList;
import java.util.List;

public class Q1436 {
    public static void main(String[] args) {
        List<List<String>> list=List.of(List.of("London","New York"),List.of("New York","Lima"),List.of("Lima","Sao Paulo"));
        String[][] arr={{"London","New York"},{"New York","Lima"},{"Lima","Sao Paulo"}};
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
