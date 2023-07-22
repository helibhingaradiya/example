public class inserttionsorting {
    public static void main(String[] args) {
        int[] num={7,8,1,2,3};

        for (int i=1;i<num.length;i++){
            int current=num[i];
            int j=i-1;
            while (j>=0 && current < num[j]){
                num[j+1]=num[j];
                j--;
            }
            num[i+1]=current;
        }

        for (int i=0;i<num.length;i++){
            System.out.print(num[i]+"  ");
        }
        System.out.println();
    }
}
