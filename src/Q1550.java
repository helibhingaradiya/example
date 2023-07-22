public class Q1550 {
    public static void main(String[] args) {
        int[] arr={1,2,34,3,4,5,7,23,12};
        int f=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]%2!=0){
                f++;
                if (f==3){
                  break;
                }
            }else {
                f=0;
            }
        }
        if (f==3){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
