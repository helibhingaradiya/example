public class SelectionSort {
    public static void main(String[] args) {
        int[] num={7,8,1,2,3};

        for (int i=0;i<num.length-i;i++){
            int smallest=i;
            for (int j=i+1;j<num.length;j++){
                if(num[smallest] > num[j]){
                    smallest=j;
                }
            }
            int temp=num[smallest];
            num[smallest]=num[i];
            num[i]=temp;
        }
        for (int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
    }
}
