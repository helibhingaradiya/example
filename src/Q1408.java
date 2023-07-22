import java.util.ArrayList;
import java.util.List;

public class Q1408 {
    public static void main(String[] args) {
        String[] words = {"ma", "mass", "hero", "superhero"};
        System.out.println(stringMatching(words));
    }

    public static List<String> stringMatching(String[] words) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (words[i].contains(words[j]) && i != j){
                    if(!list.contains(words[j])){
                        list.add(words[j]);
                    }
                }
            }
        }
        return list;
    }
}
