import java.util.*;

public class String2 {
    public static void main(String[] args) {
//        String str = "helly";
//        String str2 = "patel";
//        StringBuilder sb = new StringBuilder("helly");
////string builder functions
//        System.out.println("string buffer:");
//        System.out.println(sb.charAt(4));
//        System.out.println(sb.length());
//        System.out.println(sb.substring(2));
//        System.out.println(sb.substring(1, 3));
//        System.out.println(sb.equals("hll"));
//        System.out.println(sb.isEmpty());
//        System.out.println();
//        //string literal function
//        System.out.println("string litral:");
//        System.out.println(str.contains("helly"));
//        System.out.println(str.isEmpty());
//        System.out.println(str.equals(str2));


//        for (int i = 0; i < sb.length()/2; i++) {
//            int front=i;
//            int back=sb.length()-1-i;
//
//            char frontchar=sb.charAt(front);
//            char backchar=sb.charAt(back);
//
//            sb.setCharAt(front,backchar);
//            sb.setCharAt(back,frontchar);
//        }
//        System.out.println(sb);

        //reverse string
//        String name = "Helly Patel";
//        char[] arr = new char[name.length()];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = name.charAt(i);
//        }
//        int front = 0;
//        int end = arr.length - 1;
//        while (front < end) {
//            char temp = arr[front];
//            arr[front] = arr[end];
//            arr[end] = temp;
//            front++;
//            end--;
//        }
//        String b=new String(arr);
//        System.out.println(b);
////        for (int i = 0; i < arr.length; i++) {
////            System.out.print(arr[i]);
////        }
//
//        //palindrome
//
//        String s="abba";
//        int f=0;
//        int e=s.length()-1;
//        while (f<e){
//            if (s.charAt(f)!=s.charAt(e)){
//                System.out.println("not palindrom");
//                return;
//            }
//            f++;
//            e--;
//        }
//        System.out.println("palindrom");

        //reverse string

//        String str = "helly";
//        char[] arr = new char[str.length()];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = str.charAt(i);
//        }
//
//        int front = 0;
//        int end = arr.length - 1;
//        while (front < end) {
//            char temp = arr[front];
//            arr[front] = arr[end];
//            arr[end] = temp;
//            front++;
//            end--;
//        }
//        String b = new String(arr);
//        System.out.println(b);


        //palindrome
//        String str="naman";
//        int front=0;
//        int end=str.length()-1;
//
//        while (front<end){
//            if (str.charAt(front)!=str.charAt(end)){
//                System.out.println("not palindrom");
//                return;
//            }
//            front++;
//            end--;
//        }
//        System.out.println("palindrom");

        //count word of entence
//        String stc="";
//        if (stc.isEmpty()){
//            System.out.println("there is empry string");
//            return;
//        }
//        int count=1;
//        for (int i = 0; i < stc.length(); i++) {
//            if (stc.charAt(i)==' '){
//                count++;
//            }
//        }
//        System.out.println("number of words in sentece is "+count);


        //find duplicate from string

//        String X="25";
//        String Y="23";
//        int x=Integer.parseInt(X);
//        int y=Integer.parseInt(Y);
//        int sum=x+y;
//
//        String ans=String.valueOf(sum);
//        System.out.println(ans);



        String str="helllyyyy";

        HashSet<Character> set=new HashSet<>();
        List<Character> list=new ArrayList<>();
        char[] arr=str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
          if (set.contains(str.charAt(i))){
              if (!list.contains(str.charAt(i)))
              {
                  list.add(str.charAt(i));
              }

          }
          set.add(str.charAt(i));
        }
        System.out.println(list);

//string same or not

//        String str="helly";
//        String str2="helly";
//        if (str.length()!=str2.length()){
//            System.out.println("string are not same");
//            return;
//        }
//
//        for (int i = 0; i < str.length(); i++) {
//                if (str.charAt(i)!=str2.charAt(i)){
//                    System.out.println("strings are not same");
//                    return;
//
//            }
//        }
//        System.out.println("string are same");


//        sort string character
//        String str="helly";
//        char[] arr=str.toCharArray();
//        for (int i = 0; i < arr.length-1; i++) {
//            for (int j = i+1; j < arr.length; j++) {
//                if (arr[i]>arr[j]){
//                    char temp=arr[i];
//                    arr[i]=arr[j];
//                    arr[j]=temp;
//                }
//            }
//        }
//        System.out.println(new String(arr));


        //print frequency of all character

//        String str="helllo";
//        char[] arr=str.toCharArray();
//        HashMap<Character,Integer> map=new HashMap<>();
//
//        for (int i = 0; i < arr.length; i++) {
//            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
//        }
//        System.out.println(map);

//replace
//        String str="hello";
//        char i='h';
//        char j='t';
//
//        char[] arr=str.toCharArray();
//
//        for (int k = 0; k < arr.length; k++) {
//            if (arr[k]==i){
//                arr[k]=j;
//            }
//        }
//        System.out.println(new String(arr));

        //get frequency
//        String str="helllo";
//        int[] f=new int[26];
//       char[] arr=str.toCharArray();
//       int count=0;
//        for (int i = 0; i < arr.length-1; i++) {
//            for (int j = i+1; j < arr.length ; j++) {
//                if (arr[i]==arr[j]){
//                    count++;
//                    System.out.println("character is: "+arr[i]+" frequency is: "+count);
//                }
//
//            }
//        }
    }
}
