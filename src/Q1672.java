public class Q1672 {
    public static void main(String[] args) {
        int[][] accounts={{1,2,3},{3,2,1}};
        int sum=0;
        int max=Integer.MIN_VALUE;
        for (int i=0;i<accounts.length;i++){
            for (int j=0;j<accounts[i].length;j++){
                sum+=accounts[i][j];
            }
            max=Math.max(max,sum);
            System.out.println(sum);
            sum=0;
        }
        System.out.println(max);
    }
}
