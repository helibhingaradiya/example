import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Q2429 {
    public static void main(String[] args) {
//        double celsius=36.50;
//
//        double kelvin=celsius+273.15;
//        double Fahrenheit=celsius * 1.80 + 32.00;

//        int[] A = {3,3,3};
//        int n1 = 6;
//
//        int[] B = {3,3,3};
//        int n2 = 5;
//        int[] C = {3,3,3};
//        int n3 = 8;
//        ArrayList<Integer> list = new ArrayList<>();
//        ArrayList<Integer> list2= new ArrayList<>();
//        for (int i = 0; i < A.length; i++) {
//            if (!list.contains(A[i])) {
//                list.add(A[i]);
//            }else if(!list2.contains(A[i])){
//                list2.add(A[i]);
//            }
//        }
//        for (int i = 0; i < B.length; i++) {
//            if (!list.contains(B[i])) {
//                list.add(B[i]);
//            }else if(!list2.contains(B[i])){
//                list2.add(B[i]);
//            }
//        }for (int i = 0; i < C.length; i++) {
//            if (!list.contains(C[i])) {
//                list.add(C[i]);
//            }else if(!list2.contains(C[i])){
//                list2.add(C[i]);
//            }
//        }
//        System.out.println(list2);
//        System.out.println(list);

        int[] a={1,2 ,3, 4, 5};
        int[] b={1,2,3};
        int[] merge=new int[a.length+b.length];
        int var=a.length;
        for (int i = 0; i < a.length; i++) {
            merge[i]=a[i];
        }
        for (int i = 0; i < b.length; i++) {
            merge[var++]=b[i];
        }
        System.out.println(Arrays.toString(merge));
        int count=0;
        HashSet<Integer> set=new HashSet<>();
        for (int i = 0; i < merge.length; i++) {
            if (!set.contains(merge[i])){
                set.add(merge[i]);
                count++;
            }
        }
        System.out.println(count);
        System.out.println(set);
    }
}
