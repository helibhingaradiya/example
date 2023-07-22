public class Longestcomman {
    public static void main(String[] args) {
        int front=0;
        int second=1;
        String[] arr={"geeksforgeeks","geeks","geek","geezer"};
        for (int i=0;i<arr.length-1;i++){
            if (arr[front]!=arr[second]){

                System.out.println(front);
            }else {
                front++;
                second++;
            }
        }
    }
}
