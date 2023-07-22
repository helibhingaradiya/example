import java.util.HashMap;

public class Q925 {
    public static void main(String[] args) {
        String name = "alex", typed = "aaleex";
        System.out.println(isLongPressedName(name, typed));
    }

    public static boolean isLongPressedName(String name, String typed) {
        int i=0;
        for (int j = 0; j < typed.length(); j++) {
            if (i<name.length() && typed.charAt(i)==name.charAt(i)){
                i++;
                return true;
            } else if (j==0 && typed.charAt(j)!=typed.charAt(j-1)) {
             return false;
            }
        }
//        StringBuilder sb=new StringBuilder();
//        for (int i = 0; i < typed.length(); i++) {
//            sb.append(typed.charAt(i));
//        }
//        int f=0;
//        int s=1;
//
//        int f1=0;
//        int s1=1;
//        String ans="";
//        while (s<name.length()||s<sb.length()){
//            if (name.charAt(f)==typed.charAt(f1)){
//                ans+=typed.charAt(f);
//                f++;
//                s++;
//                f1++;
//                s1++;
//            } else if (typed.charAt(f)!=name.charAt(f1)) {
//
//                f1++;
//                s1++;
//            }
//
//        }
//        System.out.println(ans);
//        HashMap<Character,Integer> mapName=new HashMap<>();
//        HashMap<Character,Integer> mapTyped=new HashMap<>();
//        for (int i = 0; i < name.length(); i++) {
//            mapName.put(name.charAt(i), mapName.getOrDefault(name.charAt(i),0)+1);
//        }
//        for (int i = 0; i < typed.length(); i++) {
//            mapTyped.put(typed.charAt(i), mapTyped.getOrDefault(typed.charAt(i),0)+1);
//        }
//        System.out.println(mapName);
//        System.out.println(mapTyped);
//        for(char i:mapName.keySet()){
//            if (mapName.get(i)==1 && mapTyped.get(i)>=1){
//                return true;
//            } else if (mapName.get(i)>1 && mapTyped.get(i)==1 ) {
//                return false;
//
//            }
//        }
        return false;
    }
}
