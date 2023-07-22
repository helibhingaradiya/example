import java.util.ArrayList;
import java.util.Collections;

public class arrayLiist {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        //add to list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        //get

        int e=list.get(3);
        System.out.println(e);

        //add element beetween list

        list.add(0,7);
        System.out.println(list);

        //set elements
        list.set(0,9);
        System.out.println(list);

        //remove
        list.remove(2);
        System.out.println(list);

        //size
        int s=list.size();
        System.out.println(s);

        //iteration/loops
        for (int i=0;i<list.size();i++){
            System.out.print(list.get(i));
        }
        System.out.println();

        //sorting

        Collections.sort(list);
        System.out.println(list);
    }
}
