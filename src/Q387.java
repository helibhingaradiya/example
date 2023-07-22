import java.util.HashMap;
import java.util.Map;

public class Q387 {
    public static void main(String[] args) {
        String s="hello";
        System.out.println(firstUniqChar(s));
    }
    public static char firstUniqChar(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        char ans = ' ';
        for ( int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        System.out.println(map);

//        for (Map.Entry<Character, Integer> mp : map.entrySet()){
//            if (mp.getValue() == 1){
//                ans = mp.getKey();
//                break;            }
//        }
        return ans;
//        char[] arr=s.toCharArray();
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//
//        HashMap<Character,Integer> map=new HashMap<>();
//
//        for ( int i = 0; i < arr.length; i++) {
//            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
//        }
//        int j=0;
//        for(char ch:map.keySet()){
//            if (map.get(ch)==1){
//                return j;
//            }
//            j++;
//
//        }
//        int j = 0;
//        for(Map.Entry<Character,Integer> m:map.entrySet()){
//            if (map.get(arr[j])==1){
//                return j;
//            }
//            j++;
//        }

//        System.out.println(map);

    }
}
