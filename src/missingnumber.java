import java.util.HashSet;

public class missingnumber {
    public static void main(String[] args) {
        int[] array={1,2,3,5};
        HashSet<Integer> set=new HashSet<>();
        int len=array.length+1;
        int sum=(len*(len+1))/2;
        System.out.println(sum);

        for (int i=0;i<array.length;i++){
//            if (!set.contains(array[i])){
                sum-=array[i];
//                set.add(sum);
//            }
        }
        System.out.println(sum);
    }
}
