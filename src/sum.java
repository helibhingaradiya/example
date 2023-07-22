public class sum {
    public static void main(String[] args) {
        int[] num={1,2,3,4,5};
        int n = num.length;
//        System.out.println(n*(n+1)/2);
        int sum =0;
        for(int i=0;i<num.length;i++){
            sum = sum + num[i];

        }

        System.out.println(sum);

    }
}
