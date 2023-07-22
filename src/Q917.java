import java.util.Arrays;

public class Q917 {
    public static void main(String[] args) {
        String s = "Test1ng-Leet=code-Q!";
        char[] arr = s.toCharArray();
        int front = 0;
        int end = arr.length - 1;
        String ans = "";
        System.out.println((int) 'A');
        while (front <= end) {
            if (arr[front] == '-') {
                front += 1;
            } else if (arr[end] == '-') {
                end -= 1;
            } else if (arr[front] <= 65 || arr[front] >= 122) {
                front += 1;
            } else if (arr[end] <= 65 || arr[end] >= 122) {
                end -= 1;
            } else if (arr[front] == '_' || arr[front] == ']') {
                front += 1;
            } else if (arr[end] == '_' || arr[end] == ']') {
                end -= 1;
            } else {
                char temp = arr[front];
                arr[front] = arr[end];
                arr[end] = temp;
                front++;
                end--;
            }


        }
        ans = new String(arr);
        System.out.println(ans);
        System.out.println(Arrays.toString(arr));
    }
}
