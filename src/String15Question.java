import java.util.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class String15Question {
    public static void main(String[] args) {
        //reverse String
        String str1="helly my name";
        String ans="";
        Stack<Character> stk=new Stack<>();
        for (int i = 0; i < str1.length(); i++) {
            stk.push(str1.charAt(i));
        }
        while (!stk.isEmpty()){
            ans+=stk.pop();
        }
        System.out.println("reverse String is : "+ans);

    //String is palindrome
        String str2="naman";
        int f=0;
        int l=str2.length()-1;
        while (f<=l){
            if (str2.charAt(f)!=str2.charAt(l)){
                System.out.println("not palindrom");
                return;
            }
            f++;
            l--;
        }
        System.out.println("palindrom");

        //count number of word
        String str3="hello this is helly";
        int count=1;
        if (str3.length()==0){
            System.out.println("string empty");
            return;
        }
        for (int i = 0; i < str3.length(); i++) {
            if (str3.charAt(i)==' '){
                count++;
            }
        }
        System.out.println("numner of word is : "+count);

        //find duplicate from string
        String str4="helly";
        HashSet<Character> set=new HashSet<>();
        List<Character> list=new ArrayList<>();
        for (int i = 0; i < str4.length(); i++) {
            if (set.contains(str4.charAt(i))){
                if (!list.contains(str4.charAt(i))){
                    list.add(str4.charAt(i));
                }
            }else {
                set.add(str4.charAt(i));
            }
        }
        System.out.println("duplicate : "+list);

        //if two string are same or not
        String str5="hello";
        String str6="hello";
        if (str5.length()!=str6.length()){
            System.out.println("String are not same");
            return;
        }
        for (int i = 0; i < str5.length(); i++) {
            if (str5.charAt(i)!=str6.charAt(i)){
                System.out.println("strings are not same");
                return;
            }
        }
        System.out.println("string are same");

        //update a character in string
        String str7="helly";
        char arr1[]=str7.toCharArray();
        char oldchar='y';
        char newChar='o';
        for (int i = 0; i < str7.length(); i++) {
            if(arr1[i]==oldchar){
                arr1[i]=newChar;
            }
        }
        String ans1=new String(arr1);
        System.out.println("after replace :"+ans1);

        //sort string of character
        String str8="hello my name is helly";
        char arr2[]=str8.toCharArray();
        for (int i = 0; i < str8.length()-1; i++) {
            for (int j = i+1; j <str8.length() ; j++) {
                if (arr2[i]==' '||arr2[j]==' '){
                    continue;
                }
                if (arr2[i]>arr2[j]){
                    char temp=arr2[i];
                    arr2[i]=arr2[j];
                    arr2[j]=temp;
                }
            }
        }
        String ans2=new String(arr2);
        System.out.println("sorted String is :"+ans2);

        //print frequency
        String str9="hello helly";
        HashMap<Character,Integer> map=new HashMap<>();
        for (int i = 0; i <str9.length() ; i++) {
            map.put(str9.charAt(i),map.getOrDefault(str9.charAt(i),0)+1);
        }
        System.out.println("frequency : "+map);
        //remove vowel from string
        String str10="hello helly";
        String ans3="";
        for (int i = 0; i < str10.length(); i++) {
            if (str10.charAt(i)=='a'||str10.charAt(i)=='e'||str10.charAt(i)=='i'||str10.charAt(i)=='o'||str10.charAt(i)=='u'){
                continue;
            }else {
                ans3+=str10.charAt(i);
            }
        }

        System.out.println("after remove vowel : "+ans3);

        //reverse word in String
        String str11="hello my name is helly";
        Stack<Character> stack=new Stack<>();
        String ans4="";
        for (int i = 0; i < str11.length(); i++) {
            if (str11.charAt(i)==' '){
                while (!stack.isEmpty()){
                    ans4+=stack.pop();
                }
                ans4+=' ';
            }else {
                stack.push(str11.charAt(i));
            }
        }
        while (!stack.isEmpty()){
            ans4+=stack.pop();
        }
        System.out.println("word reverse string is : "+ans4);

        // remove all digit
        String str12="hello1 my2 name3 is4 helly5";
        String ans5="";
        int zero=(char)'0';
        int nine=(char)'9';

        for (int i = 0; i <str12.length() ; i++) {
            if(str12.charAt(i)>=zero && str12.charAt(i)<=nine){
             continue;
            }else {
                ans5+=str12.charAt(i);
            }
        }
        System.out.println("after remove digit: "+ ans5);
        //merge string alternativly
        String str13="hello";
        String str14="helly";
        int p1=0;
        int p2=0;
        String ans6="";
        while (p1<str13.length()||p2<str14.length()){
            if (p1<str13.length()){
                ans6+=str13.charAt(p1);
                p1++;
            }
            if (p2<str14.length()){
                ans6+=str14.charAt(p2);
                p2++;
            }
        }
        System.out.println("merged String is : "+ans6);
        //check digit and character

        String str15="hello1 2345t";
        int num=0;
        int ch=0;
        for (int i = 0; i < str15.length(); i++) {
            if (str15.charAt(i)==' '){
                continue;
            }
            if (str15.charAt(i)>=zero && str15.charAt(i)<=nine){
                num++;
            }else {
                ch++;
            }

        }
        System.out.println("total number is : "+num +" and character is : "+ch);

        //remove duplicate from Strnig
        String str17="hello this is helli";
        char[] arr3=str17.toCharArray();
        String ans7="";
        for (int i = 0; i < arr3.length; i++) {
            int j = 0;
            for (; j < i; j++) {
                if(arr3[i]==arr3[j]){
                    break;
                }
            }
            if (j==i){
                ans7+=arr3[i];
            }
        }
        System.out.println(ans7);
        
        //check word palindrom
        String str18="naman naman naman";
        String arr4[]=str18.split(" ");
        for (int i = 0; i < arr4.length; i++) {
            if(ispli(arr4[i]) == false){
                System.out.println("not palindrome");
                return;
            }
        }
        System.out.println("palindrome");

    }

    private static boolean ispli(String word) {
        int left = 0;
        int right = word.length()-1;
        if(word.charAt(left) != word.charAt(right)){
            return false;
        }else {
            left++;
            right--;
        }
        return true;
    }
}
