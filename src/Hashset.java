import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
    public static void main(String[] args) {
        //create hashset
        HashSet<Integer> set = new HashSet<>();
        //insert in hashset

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        System.out.println(set);

        //search
        if (set.contains(1)){
            System.out.println("contain 1");
        }
        //without negation operator it will return false thats why does not print for that reasion use ! operator
        if (!set.contains(4)){
            System.out.println("contain");
        }

        //remove set elemets
        set.remove(1);
        if (!set.contains(1)){
            System.out.println("does not contain 1 cause we delete it");
        }
        System.out.println(set );


        //size of set
        System.out.println("size of set is:");
        System.out.println(set.size());

        //iterator
        System.out.println("iterator:");
        Iterator it=set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
