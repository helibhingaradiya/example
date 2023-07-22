import java.util.Stack;
public class Q1614 {
    public static void main(String[] args) {
   String s="(1)+((2))+(((3)))";
        System.out.println(maxDepth(s));
    }
    public static int maxDepth(String str) {
        int c=0,max=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='(')
                c++;
            else if(ch==')')
                c--;
            if(c>max)
                max=c;
        }
        return max;
    }
}
