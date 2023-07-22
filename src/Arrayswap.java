public class Arrayswap {
    public static void main(String[] args) {
//        char[] str = {'h', 'e', 'l', 'l', 'y'};
//        int front = 0;
//        char temp;
//        int end = str.length - 1;
//        while (front < end) {
//            temp = str[front];
//            str[front] = str[end];
//            str[end] = temp;
//            front++;
//            end--;
//        }
//
//        for (int i = 0; i < str.length; i++) {
//            System.out.println(str[i]);
//        }
        char[] str={'h','e','l','l','y'};
        char front;
        int end=str.length-1;
        char temp;
        for (int i=0;i<=end;i++){
            temp=str[i];
            str[i]=str[end];
            str[end]=temp;
            end--;
        }
        for (int i=0;i<str.length;i++){
            System.out.println(str[i]);
        }
    }
}
