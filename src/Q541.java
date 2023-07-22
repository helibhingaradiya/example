import java.util.Arrays;

public class Q541 {
    public static void main(String[] args) {
        String s="abcd";
        char[] arr=s.toCharArray();
        int k=4;
        int front=0;
        int second=k-1;
        int in = 0;
        for (int i = 0; i < arr.length; i+=k) {
            if(in % 2 == 0){
                front=i;
                second=i+k-1;
                while (front<second){
                    char temp=arr[front];
                    arr[front]=arr[second];
                    arr[second]=temp;
                    front++;
                    second--;
                }
            }
            in++;
            System.out.println(i);
        }
        System.out.println(Arrays.toString(arr));
    }
}
