import java.util.HashSet;

public class recursion {
//    print 5 to1;
//    public static void printNum(int n) {
//        if(n == 0){
//            return;
//        }
//        System.out.println(n);
//        printNum(n-1);
//    }
//    public static void main(String[] args) {
//        int n=5;
//        printNum(n);
//    }
    //print 1 to 5
//    public static void printNum(int n) {
//        if (n == 6){
//            return;
//        }
//        System.out.println(n);
//        printNum(n+1);
//
//    }
//
//    public static void main(String[] args) {
//        int n=1;
//        printNum(n);
//    }

    //print sum of n number
//    public static void printSum(int i,int n,int sum) {
//       if(i == n){
//           sum += i;
//           System.out.println(sum);
//           return;
//       }
//       sum +=i;
//       printSum(i+1,n,sum);
//        System.out.println("i is: "+i+" sum of i is: "+sum);
//    }
//    public static void main(String[] args) {
//        printSum(1,5,0);
//    }

    //factorial
//    public static int calcSum(int n) {
//        if(n == 1 || n== 0){
//            return 1;
//        }
//        int factn1=calcSum(n-1);
//        int factn2=n*factn1;
//        return factn2;
//    }
//    public static void main(String[] args) {
//        int n=6;
//        int ans=calcSum(n);
//        System.out.println(ans);
//    }

    //fiboncci
//    public static void printFib(int a, int b, int n) {
//        if (n == 0) {
//            return;
//        }
//        int c = a + b;
//        System.out.println(c);
//        printFib(b, c, n - 1);
//    }
//
//    public static void main(String[] args) {
//        int a = 0;
//        int b = 1;
//        int n = 5;
//        System.out.println(a);
//        System.out.println(b);
//        printFib(a, b, n);
//    }

    //x^n
//    public static int printCal(int x, int n) {
//        if (n == 0) {
//            return 1;
//        }
//        if (x == 0) {
//            return 0;
//        }
//        int v1 = printCal(x, n - 1);
//        int v2 = x * v1;
//        return v2;
//    }
//
//    public static void main(String[] args) {
//        int x = 2;
//        int n = 5;
//        int ans = printCal(x, n);
//        System.out.println(ans);
//    }
//    x^n=heght level
//    public static int printHeght(int x,int n) {
//        if(x == 0){
//            return 0;
//        }
//        if (n == 0){
//            return 1;
//        }
//        if(n%2==0){
//            return printHeght(x,n/2)*printHeght(x,n/2);
//        }
//        else {
//            return printHeght(x,n/2)*printHeght(x,n/2)
//                    *2;
//        }
//    }
//    public static void main(String[] args) {
//  int x=2;
//  int n=5;
//   int ans=printHeght(x,n);
//        System.out.println(ans);
//    }

    //string reverse
//    public static void printString(String str,int index) {
//        if (index == 0){
//            System.out.println(str.charAt(index));
//            return;
//        }
//        System.out.print(str.charAt(index));
//        printString(str,index-1);
//    }
//    public static void main(String[] args) {
//  String str="helly patel,my";
//  printString(str,str.length()-1);
//    }

    //check sort array with recursion
//    public static boolean printArray(int[] array,int index) {
//        if (index == array.length-1){
//            return true;
//        }
//        if (array[index] <array[index+1]){
//          return   printArray(array,index+1);
//        }else {
//            return false;
//        }
//
//    }
//    public static void main(String[] args) {
//        int[] array={2,3,1,4,5};
//        System.out.println( printArray(array,0));
//    }

    //x put in last using recursion
//    public static void moveX(String str, int index, int count, String newstr) {
//        if (index == str.length()){
//            for (int i=0;i<count;i++){
//                newstr += 'x';
//            }
//            System.out.println(newstr);
//            return;
//        }
//         char current=str.charAt(index);
//         if (current == 'x'){
//             count++;
//             moveX(str,index+1,count,newstr);
//         }else {
//             newstr += current;
//             moveX(str,index+1,count,newstr);
//         }
//    }
//
//    public static void main(String[] args) {
//        String str = "axbcxxd";
//        moveX(str, 0, 0, "");
//    }

    //remove duplicate of string
//    public static boolean[] map=new boolean[26];
//    public static void removeDup(String str,int index,String newstr) {
//        if (index == str.length()){
//            System.out.println(newstr);
//            return;
//        }
//        char current=str.charAt(index);
//        if (map[current - 'a'] ){
//          removeDup(str,index+1,newstr);
//        }else {
//            newstr+=current;
//            map[current - 'a']=true;
//            removeDup(str,index+1,newstr);
//        }
//
//    }
//    public static void main(String[] args) {
//        String str="abbcddeff";
//        removeDup(str,0,"");
//        }
    //subsequences
//    public static void subsequence(String str,int index,String newstr) {
//        if (index == str.length()){
//            System.out.println(newstr);
//            return;
//        }
//      char current=str.charAt(index);
//        //add
//        subsequence(str,index+1,newstr+current);
//        //not add
//        subsequence(str,index+1,newstr);
//    }
//    public static void main(String[] args) {
//        String str="abcs";
//        subsequence(str,0,"");
//    }

    //unique subsequece
//    public static void subsequence(String str,int index,String newstr,HashSet<String> set) {
//        if (index == str.length()){
//            if (set.contains(newstr)){
//                return;
//            }
//            else {
//            System.out.println(newstr);
//            set.add(newstr);
//            return;
//            }
//        }
//      char current=str.charAt(index);
//        //add
//        subsequence(str,index+1,newstr+current,set);
//        //not add
//        subsequence(str,index+1,newstr,set);
//    }
//    public static void main(String[] args) {
//        String str="aaa";
//        HashSet<String> set=new HashSet<>();
//        subsequence(str,0,"",set);
//    }
//keypad
    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void print(String str, int index, String combination) {
        if (index == str.length()) {
            System.out.print(combination +" ");
            return;
        }
        char current = str.charAt(index);
        String mapping = keypad[current - '0'];

        for (int i = 0; i < mapping.length(); i++) {
            print(str, index + 1, combination + mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
        String str = "23";
        print(str, 0, "");
    }
}
