import java.util.*;
import java.util.Stack;

public class Parenthesis_Checker {
    public static void main(String[] args) {
        String x = "[({[([{}])]})]";
        System.out.println(ispar(x));
        String s = "a";
        System.out.println(isPalindrome(s));
        String S = "zvvo";
        System.out.println(removeDups(S));
        String rev = "GeeksforGeeks";
        System.out.println(reverse(rev));
//        int N = 4;
//        int arr[] = {0, 3, 1, 2};
//        long arr2[] = {2, 4, 5, 0, 1};
//        System.out.println(duplicates(arr, N));
        int size = 3;
        int A[] = {1, 2, 3};
        System.out.println(majorityElement(A, size));
        Stack<Integer> stack = new Stack<>();
        stack.push(11);
        stack.push(2);
        stack.push(32);
        stack.push(3);
        stack.push(41);

        System.out.println(sort(stack));
//       int N = 4;long  arr[] = {1, 3, 2, 4};
//        System.out.println(Arrays.toString(nextLargerElement(arr, N)));
//        int L = 6;
//        int N = 78;
//        int arr[] = {5, 20, 3, 2, 5, 80};
//        System.out.println(findPair(arr, L, N));
//       int N = 5;
//       int arr[] = {4, 2, 1, 5, 3};
//       immediateSmaller(arr,N);
        String Str = "i.like.this.program.very.much";
        System.out.println(reverseWords(Str));
//        int X = 7;
//        int Y = 7;
//       String St = "prpptppr";
//        System.out.println(solve(X,Y,St));
//        int N = 6;
//        int X = 16;
//        int Arr[] = {1, 4, 45, 6, 10, 8};
//        System.out.println(hasArrayTwoCandidates(Arr, N, X));
//        int N = 3;
//        String arr[] = {"Geeks", "For", "Geeks"};
////        System.out.println(secFrequent(arr,N));
//        System.out.println(countWords(arr, N));
//        int k = 2;
//        int N=4;
//        ArrayList<Integer> list=new ArrayList<>();
//        list.add(100);
//        list.add(200);
//        list.add(300);
//        list.add(400);
//        System.out.println(maximumSumSubarray( k,list,N));
//        int Arr[] = {4, 2, 1, 10, 6};
//        int num1 = 4;int num2 = 6;
//        int n=5;
//        System.out.println(getCount(Arr,n,num1,num2));
//      String  String1 = "hkrrtbxwkabeihgcdqew";
//        System.out.println(findLength(String1));
//        String N1 = "12";
//       String N2 = "15";
       String str = "this is not right";
        System.out.println(maximumFrequency(str));
    }
    public static String maximumFrequency (String S) {
        //Complete the function
        HashMap<String,Integer> map=new HashMap<>();
        String[] arr=S.split(" ",S.length());
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        String ans="";
        int max=Integer.MIN_VALUE;
        for(Map.Entry<String,Integer> mp:map.entrySet()){

            if(mp.getValue()>max){
                max=mp.getValue();
                ans=mp.getKey();
                ans+=' ';
                ans+=mp.getValue();
            }
        }
        return ans;
    }
    public static String transform(String s)
    {
        // code here

        String ans="";
        s=s.trim();
        for(int i=0;i<s.length();i++){
            if(i==0){
                ans+= Character.toUpperCase(s.charAt(i));
            }else if(s.charAt(i)==' ' && s.charAt(i+1)!=' '){
                ans+=' ';
                ans+=Character.toUpperCase(s.charAt(i+1));
                i++;
            }else{
                ans+=s.charAt(i);
            }
        }
        return ans;
    }
   static int isSame(String s) {
        // code here
        int length=s.length()-1;
       System.out.println(length);
       System.out.println((int)s.charAt(s.length()-2));
        if((int)s.charAt(s.length()-1)==length){
            return 1;
        }
        return 0;
    }
   static int EvenOdd(String n1 , String n2)
    {
        System.out.println(n1.length()-1);
        int ans=Integer.parseInt(n1) * Integer.parseInt(n2);
//        if (ans)
        //code here.
        return 0;
    }
    static int findLength(String s)
    {
        System.out.println(s.length()-2);
        // code here
        Stack<Character> stack=new Stack<>();
        int c=0;
        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i)==' '){
                while (!stack.isEmpty()){
                    stack.pop();
                }
            }else {
                stack.push(s.charAt(i));
            }
        }
        while (!stack.isEmpty()){
            stack.pop();
            c++;
        }
        return c;
//        int l=s.length()-1;
//        int c=0;
//        while(l>0){
//            if(s.charAt(l)==' '){
//                return c;
//            }else{
//                c++;
//                l--;
//            }
//
//        }
//        return 0;
    }
    static int getCount(int arr[], int n, int num1, int num2)
    {
        // Complete the function
        int f=0;
        int l=n-1;
        int ans=0;
        while(f<l){
            if(arr[f]==num1 && arr[l]==num2){
                while(f<l-1){
                    f++;
                    ans++;
                }
            }else{
                f++;
                l--;
            }

        }
        return ans;
    }
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        // code here
            int[] arr=new int[Arr.size()];
            for (int i = 0; i < Arr.size(); i++) {
                arr[i]= Arr.get(i);
            }
            long maxsum=Integer.MIN_VALUE;
            int sum=0;
            for(int i=0;i<K;i++){
                sum+=arr[i];
            }
            maxsum=sum;
            for(int i=K;i<N;i++){
                sum=sum-arr[i-K]+arr[i];
                maxsum=Math.max(maxsum,sum);
            }
            return maxsum;
    }


    public static double findMaxAverage(int[] nums, int k) {
        double ans = Integer.MIN_VALUE;
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];

        }
        double s = sum / k;
        ans=s;
        for (int i = k; i < nums.length; i++) {
            sum += nums[i];
            sum -= nums[i - k];
            s = sum / k;
            ans = Math.max(ans, s);
        }
        return ans;
    }

    static public int findUnique(int a[], int n, int k) {
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> mp : map.entrySet()) {
            if (mp.getValue() != k) {
                ans = mp.getKey();
            }
        }
        return ans;
    }

    static public int countWords(String list[], int n) {
        int ans = 0;
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list.length; i++) {
            map.put(list[i], map.getOrDefault(list[i], 0) + 1);
        }
        for (Map.Entry<String, Integer> mp : map.entrySet()) {
            if (mp.getValue() == 2) {
                ans++;
            }
        }
        int len = 0;
        for (int i = 0; i < list.length; i++) {

            if (len < list[i].length()) {
                len = list[i].length();
            }

        }
        return ans;
    }

    static String secFrequent(String arr[], int N) {

        String ans = "";
        int max = Integer.MIN_VALUE;
        int Secondmax = Integer.MIN_VALUE;
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for (Map.Entry<String, Integer> mp : map.entrySet()) {
            if (mp.getValue() > max) {
                max = mp.getValue();
            }
        }
        for (Map.Entry<String, Integer> mp : map.entrySet()) {
            if (mp.getValue() == max) {
                continue;
            }
            if (mp.getValue() >= Secondmax) {
                Secondmax = mp.getValue();

            }

        }
        for (Map.Entry<String, Integer> mp : map.entrySet()) {

            if (mp.getValue() == Secondmax) {
                ans = mp.getKey();
            }

        }
        System.out.println("secondmax + " + Secondmax + "Max + " + max);
        return ans;// your code here
    }

    static boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        Arrays.sort(arr);
        int front = 0;
        int last = n - 1;
        while (front < last) {
            if (arr[front] + arr[last] == x) {
                return true;
            } else if (arr[front] + arr[last] > x) {
                last--;
            } else {
                front++;
            }
        }
        return false;
    }

    static long solve(int X, int Y, String S) {
        long ans = 0;
        int count = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            if (stack.isEmpty()) {
                stack.push(S.charAt(i));
            } else {
                if (S.charAt(i) == 'p' && stack.peek() == 'r') {
                    stack.pop();
                    count++;
                } else if (S.charAt(i) == 'r' && stack.peek() == 'p') {
                    stack.pop();
                    count++;
                } else {
                    stack.push(S.charAt(i));
                }
            }
        }
        ans = count * X;
        return ans;
    }

    static String reverseWords(String S) {
        String ans = "";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) != '.') {
                stack.push(S.charAt(i));
            } else {
                while (!stack.isEmpty()) {
                    ans += stack.pop();
                }
                ans += '.';
            }

        }
        while (!stack.isEmpty()) {
            ans += stack.pop();
        }

        return ans;
        // your code here
    }

    static void immediateSmaller(int[] arr, int n) {
        int[] ans = new int[arr.length];

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] < arr[i]) {
                ans[i] = arr[i + 1];
            } else {
                ans[i] = -1;
            }
        }
        ans[arr.length - 1] = -1;
//        System.out.println(ans[arr.length-1]);
        for (int i = 0; i < ans.length; i++) {
            arr[i] = ans[i];
        }

        // code here
    }

    public static boolean findPair(int arr[], int size, int n) {

        //code here.
        Arrays.sort(arr);
        int f = 0;
        int l = arr.length - 1;
        while (f < l) {
            if (arr[l] - arr[f] == n) {
                return true;
            }
            if (arr[l] - arr[f] < n) {
                f++;
            } else {
                l--;
            }
        }

        return false;
    }

    public static long[] nextLargerElement(long[] arr, int n) {
        long[] a = new long[arr.length];

        return a;
        // Your code here
    }

    public static Stack<Integer> sort(Stack<Integer> s) {
        Stack<Integer> reverse = new Stack<>();
        Stack<Integer> temp = new Stack<>();
        while (!s.isEmpty()) {

            if (reverse.isEmpty() || reverse.peek() <= s.peek()) {
                reverse.push(s.pop());
            } else {
                while (!reverse.isEmpty() && reverse.peek() > s.peek()) {
                    temp.push(reverse.pop());
                }
                reverse.push(s.pop());
                while (!temp.isEmpty())
                    reverse.push(temp.pop());
            }
        }
        return reverse;
        //add code here.
    }

    static int majorityElement(int a[], int size) {
        // your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> mp : map.entrySet()) {
            if (mp.getValue() > size / 2) {
                return mp.getKey();
            }
        }
        return -1;
    }

    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int[] a = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            a[arr[i]] += 1;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 1) {
                list.add(a[i]);
            }
        }
        if (list.isEmpty()) {
            list.add(-1);
        }

        return list;
    }

    public static boolean check(long A[], long B[], int N) {
        //Your code here
        Arrays.sort(A);
        Arrays.sort(B);
        if (A.length != B.length) {
            return false;
        }
        for (int i = 0; i < A.length; i++) {
            if (A[i] != B[i]) {
                return false;
            }
        }
        return true;
    }

    static public int peakElement(int[] arr, int n) {
        if (n == 1)
            return 0;

        if (arr[0] > arr[1])
            return 0;

        if (arr[n - 1] > arr[n - 2])
            return n - 1;

        int result = 0;
        for (int i = 1; i < n - 1; i++) {

            if (arr[i - 1] < arr[i] && arr[i] >= arr[i + 1]) {
                result = i;
                break;
            }
        }
        return result;
    }

    static ArrayList<Integer> leaders(int arr[], int n) {
        // Your code here
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int j = i + 1;
            while (j < arr.length && arr[i] < arr[j]) {
                j++;
            }
        }

        return list;
    }

    static public String reverse(String S) {
        //code here
        String ans = "";
        HashSet<Integer> set = new HashSet<>();

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            stack.push(S.charAt(i));
        }
        while (!stack.isEmpty()) {
            ans += stack.pop();
        }
        return ans;
    }

    static String removeDups(String S) {
        // code here
        String ans = "";
        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < S.length(); i++) {
            if (!set.contains(S.charAt(i))) {
                set.add(S.charAt(i));
                ans += S.charAt(i);
            }
        }
        return ans;
    }

    static int isPalindrome(String S) {
        // code here
        if (S.isEmpty()) {
            return 1;
        }
        int f = 0;
        int l = S.length() - 1;
        while (f < l) {
            if (S.charAt(f) == S.charAt(l)) {
                f++;
                l--;
            } else {
                return 0;
            }
        }

        return 1;
    }

    static boolean ispar(String x) {
        Stack<Character> stack = new Stack<>();
        // add your code here
        for (int i = 0; i < x.length(); i++) {
            if (stack.isEmpty()) {
                stack.push(x.charAt(i));
            } else {
                if (x.charAt(i) == ')' && stack.peek() == '(') {
                    stack.pop();
                } else if (x.charAt(i) == '}' && stack.peek() == '{') {
                    stack.pop();
                } else if (x.charAt(i) == ']' && stack.peek() == '[') {
                    stack.pop();
                } else {
                    stack.push(x.charAt(i));
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;

        }
    }
}
