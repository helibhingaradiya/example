import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Mergestring {

    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder();
        String s1="name";
        String s2="helly";
        int p1=0;
        int p2=0;
        while (p1<s1.length() || p2<s2.length()){
            if (p1<s1.length()){
                sb.append(s1.charAt(p1));
                p1++;
            }
            if (p2<s2.length()){
                sb.append(s2.charAt(p2));
                p2++;
            }
        }

//        System.out.println(sb);
//        String str="bababipop";
//        System.out.println(Sandwiched_Vowel(str));
//      String  S = "geeksforgeeks";
//        System.out.println(isPossible(S));
       String S = "hello";
//        System.out.println(reverseString(S));
        System.out.println(nonrepeatingCharacter(S));
       int N = 5;
       int[] arr = {2, 2, 5, 10, 1, 2, 10, 5, 10, 2};
        System.out.println(isFrequencyUnique(N,arr));
    }
    public static boolean isFrequencyUnique(int n, int[] arr) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        System.out.println(map);
        for(Map.Entry<Integer,Integer> mp:map.entrySet()){
            for(Map.Entry<Integer,Integer> m:map.entrySet()){
                     if(mp.getValue()==m.getValue()){
                         return false;
                     }
            }
        }
        return true;
    }
    public static String maximumFrequency (String S) {
        //Complete the function
        int max=Integer.MIN_VALUE;
        String ans="";
        HashMap<String,Integer> map=new HashMap<>();
        String[] arr=S.split(" ",S.length());
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])>max){
                max=map.get(arr[i]);
                ans=arr[i];
            }
        }
        String maxs= String.valueOf(max);
        ans+=" ";
        ans+=maxs;
        return ans;
    }
    static char nonrepeatingCharacter(String S)
    {
        //Your code here
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<S.length();i++){
            map.put(S.charAt(i),map.getOrDefault(S.charAt(i),0)+1);
        }
        char ans=' ';
        for(int i=0;i<S.length();i++){
            if (map.get(S.charAt(i))==1){
                ans=S.charAt(i);
                break;
            }
        }
        return ans;
    }
    public  static String reverseString(String s)
    {
        //code here.
        HashSet<Character> set=new HashSet<>();
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<s.length();i++){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
                sb.append(s.charAt(i));
            }
        }
       return new String(sb);
    }
    public static String solve(String a)
    {
        int c=0;
        HashMap<Character,Integer> set=new HashMap<>();
        for(int i=0;i<a.length();i++){
            set.put(a.charAt(i),set.getOrDefault(a.charAt(i),0)+1);
        }
       for(Map.Entry<Character,Integer> mp:set.entrySet()){
           if (isVowel2(mp.getKey())){
               c++;
           }
       }
        if (c%2==0){
            return "SHE!";
        }else{
            return "HE!";
        }

        //code here
    }
    public static boolean isVowel2(char ch)
    {
        return ch!='a'&& ch!='e' && ch!='o' && ch!='i'&& ch!='u';
        //code here
    }
   static int isPossible (String S)
    {
        // your code here
        HashSet<Character> set = new HashSet<>();
        for(char ch:S.toCharArray()){
            if(set.contains(ch)){
                set.remove(ch);
            }else{
                set.add(ch);
            }
        }
        if(set.size()>1){
            return 0;
        }
        return 1;
    }
    public static String Sandwiched_Vowel(String str)
    {
        // Complete function
        StringBuilder sb=new StringBuilder("");
        if(str.length()<=2){
            return str;
        }
        sb.append(str.charAt(0));
        for(int i=1;i<str.length()-1;i++){
            char pre = str.charAt(i-1);
            char ch  = str.charAt(i);
            char next = str.charAt(i+1);
            if(isVowel(pre) || !isVowel(ch) || isVowel(next)){
                sb.append(ch);
            }
        }
        sb.append(str.charAt(str.length() -1));
        return sb.toString();
    }
    public static boolean isVowel(char ch)
    {
        // Complete function
        return ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'||ch=='u';
    }
}
