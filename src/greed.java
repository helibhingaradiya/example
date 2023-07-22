public class greed {
    public static void main(String[] args) {
       int[] A={1,2,3,4};
       int end=A.length-1;
       int temp;

       for (int i=0;i<=end;i++){
           temp=A[i];
           A[i]=A[end];
           A[end]=temp;
           end--;
       }

        for (int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();
    }
}
