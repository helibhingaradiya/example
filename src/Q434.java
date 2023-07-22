public class Q434 {
    public static void main(String[] args) {
        String s = "Hello, my name is John";
        String[] arr = s.split(" ", 10);
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==" ")
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
