public class All_Recursion {
    public static void main(String[] args) {
        int n=5;
        int sum=10;
//        System.out.println(infinite());
        System.out.println(fact(n));
        System.out.println(SumNnatural(sum));
        int NthTerm=3;
        System.out.println(PrintNthTerm(NthTerm));
        int[] arr={1,2,3,4,5};
        System.out.println(PrintArray(arr));
    }

    private static int PrintArray(int[] arr) {
        int i=0;
        if (i==arr.length-1){
            return 1;
        }
        return PrintNthTerm(arr[i]);
    }

    private static int PrintNthTerm(int nthTerm) {
        if (nthTerm==1){
            return 1;
        }
        return PrintNthTerm(nthTerm-1);
    }

    private static int SumNnatural(int sum) {
        if (sum==1){
            return 1;
        }
        return sum+SumNnatural(sum-1);
    }

//    private static boolean infinite() {
//        return infinite();
//    }

    private static int fact(int n) {
        if (n==1){
            return 1;
        }
        return n*fact(n-1);
    }

}
