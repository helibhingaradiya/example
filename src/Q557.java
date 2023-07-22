import java.util.Arrays;
import java.util.concurrent.RecursiveTask;

public class Q557 {

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String[] arr=s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            char[] ans=arr[i].toCharArray();
            int front=0;
            int last=ans.length-1;
            while (front<last){
                char temp=ans[front];
                ans[front]=ans[last];
                ans[last]=temp;
                front++;
                last--;
            }
            arr[i]=new String(ans);
        }
        System.out.println(Arrays.toString(arr));
        StringBuilder sb=new StringBuilder();
        for (String ans: arr) sb.append(ans+" ");
        System.out.print(sb.toString());

        String str=" ";
        for (int i = 0; i < arr.length; i++) {
            str+=arr[i];
            if(i != arr.length){
                str+=" ";
            }
        }
        System.out.println(str);
//        String str1 = "man naman       ";
//        String str2 = str1.trim();
//        System.out.print(str2);
//        System.out.print(str);
//
//
//        System.out.println(sb);
//        for (int i = 0; i < arr.length; i++) {
//            sb.append(arr[i]+" ");
//            System.out.println(sb);
//        }
    }



}
