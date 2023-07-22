import java.util.Arrays;

public class Q744 {
    public static void main(String[] args) {
        char[] letters={'x','x','y','y'};
        Arrays.sort(letters);
        char target='z';

        System.out.println(nextGreatestLetter(letters,target));
    }
    public static char nextGreatestLetter(char[] letters, char target) {
    char ans=' ';
    int a=(int) target;
    int z=(int) 'z';
    int front=0;
    while (front<letters.length){

          if (a>letters[letters.length-1]) {
            ans=letters[0];
            break;
        } else if (letters[front]<a) {
            front++;

        } else {
            ans=letters[front];
            break;
        }
    }
    return ans;
    }
}
