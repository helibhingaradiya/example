import java.util.HashMap;

public class Q575 {
    public static void main(String[] args) {
        int[] candyType={1,1,2,2,3,3};
        System.out.println(distributeCandies(candyType));
    }
    public static int distributeCandies(int[] candyType) {
   int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < candyType.length; i++) {
            map.put(candyType[i],map.getOrDefault(candyType[i],0)+1);
        }
        for(int i:map.keySet()){
            if (map.size()==candyType.length/2){
                return map.size();
            }
            if (map.size()<candyType.length/2){
                return map.size();
            }
        }
   return map.size();
    }
}
