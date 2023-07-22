import java.util.*;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> hashmap = new HashMap<>();
        //student roll number and name
        //in hashmap insert
        hashmap.put("helly", 404);
        hashmap.put("jinal", 407);
        hashmap.put("riddhi", 424);
        hashmap.put("yashvi", 411);
        System.out.println(hashmap);

        //this will update value if that key exists otherwise it create new map
        hashmap.put("helly", 4);
        System.out.println(hashmap);
        //searching for key

        if (hashmap.containsKey("helly")) {
            System.out.println("exist");
        } else {
            System.out.println("not exist");
        }

        //value get

        System.out.println(hashmap.get("helly"));//exist  it will return that key values
        System.out.println(hashmap.get("abcd"));//does not exists  it will return null

        //iteration using entrySet
        System.out.println("iterations");
        for (Map.Entry<String,Integer> e: hashmap.entrySet()){
            //key print
            System.out.println(e.getKey());
            //value print
            System.out.println(e.getValue());
        }
        //using keySet

        Set<String> keys=hashmap.keySet();
        for (String key:keys){
            System.out.println(key+" "+hashmap.get(key));
        }

        //remove
        hashmap.remove("jinal");
        System.out.println(hashmap);

        //map within map
    }
}
