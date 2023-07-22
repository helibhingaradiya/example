public class Q2000 {
    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';
        System.out.println(reversePrefix(word, ch));
    }

    public static String reversePrefix(String word, char ch) {
        char[] arr = word.toCharArray();
      int index=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==ch){
                index=i;
                break;
            }
        }
        String sub=word.substring(0,index+1);
        char[] array=sub.toCharArray();
        StringBuilder sb=new StringBuilder();
        for (int i = array.length-1; i >=0; i--) {
            sb.append(array[i]);
        }
        for (int i = index+1; i < arr.length; i++) {
            sb.append(arr[i]);
        }
        System.out.println(sb);
        return sb.toString();
    }
}
