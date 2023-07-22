import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class HashMap_And_HashSet {
    public static void main(String[] args) {
        //Find whether an array is subset of another array
//        int[] arr1={1,2,3,4,5,6,7,8,9};
//        int[] arr2={2,3,4,5,10};
//        HashSet<Integer> set=new HashSet<>();
//        for (int i = 0; i < arr1.length; i++) {
//            set.add(arr1[i]);
//        }
//        for (int i = 0; i < arr2.length; i++) {
//            if (!set.contains(arr2[i])){
//                System.out.println("not subset");
//                return;
//            }
//        }
//        System.out.println("subset");

        //Check if pair with given Sum exists in Array
//        int arrQ2[] ={2,4,6,8,10};
//        int sum=16;
//        HashSet<Integer> set2=new HashSet<>();
//        for (int i = 0; i < arrQ2.length; i++) {
//            int diff=sum-arrQ2[i];
//            if (set2.contains(diff)){
//                System.out.println("present");
//                return;
//            }else {
//                set2.add(arrQ2[i]);
//            }
//        }
//        System.out.println("not present");

//      count frequent element in an array
//        int[] arrQ3 = {1, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5};
//        HashMap<Integer,Integer> map=new HashMap<>();
//        for (int i = 0; i < arrQ3.length; i++) {
//            if (map.containsKey(arrQ3[i])){
//                int freq=map.get(arrQ3[i]);
//                map.put(arrQ3[i],freq+1);
//            }else {
//                map.put(arrQ3[i],1 );
//            }
//
//        }
//        for(Map.Entry<Integer,Integer> m:map.entrySet()){
//            System.out.print(m.getKey()+"-->"+m.getValue());
//            System.out.println();
//        }

        //Most frequent element in an array
//        int[] arrQ4={1,1,2,2,2,3,3,4,4,4,4,4,4,4};
//        HashMap<Integer,Integer> map=new HashMap<>();
//        for (int i = 0; i < arrQ4.length; i++) {
//            if (map.containsKey(arrQ4[i])){
//                int freq=map.get(arrQ4[i]);
//                map.put(arrQ4[i],freq+1);
//            }else {
//                map.put(arrQ4[i],1 );
//            }
//        }
//        int mostfreq=0;
//        int mostfreqele=0;
//        for(Map.Entry<Integer,Integer> m:map.entrySet()){
//            if (m.getValue()>mostfreq){
//                mostfreq=m.getValue();
//                mostfreqele=m.getKey();
//            }
//        }
//        System.out.println(mostfreqele);

//        Check if two arrays are equal or not
//        int arrQ41[]={1,2,3,4,5};
//        int arrQ42[]={1,2,2,4,5};
//        HashMap<Integer,Integer> map=new HashMap<>();
//        HashMap<Integer,Integer> map2=new HashMap<>();
//        if (arrQ41.length!=arrQ42.length){
//            System.out.println("not equal");
//            return;
//        }
//        for (int i = 0; i < arrQ41.length; i++) {
//            map.put(arrQ41[i],map.getOrDefault(arrQ41[i],0)+1);
//        }
//        for (int i = 0; i < arrQ42.length; i++) {
//            map.put(arrQ42[i],map.getOrDefault(arrQ42[i],0)+1);
//
//        }
//        for(Map.Entry<Integer,Integer> m:map.entrySet()){
//            Integer key=m.getKey();
//            if (map2.get(key)!=m.getValue()){
//                System.out.println("not equal");
//                return;
//            }
//        }
//        System.out.println("equal");

//        Print all the duplicate numbers in array
//        int[] arrQ5={1,2,3,4,4,5,5,6};
//        HashSet<Integer> set=new HashSet<>();
//        for (int i = 0; i < arrQ5.length; i++) {
//            if (!set.contains(arrQ5[i])){
//                set.contains(arrQ5[i]);
//            }else {
//                System.out.print(arrQ5[i]);
//                System.out.println();
//            }
//            set.add(arrQ5[i]);
//        }

        // Count frequency of each number in array
//        int[] arrQ6={1,2,3,4,4,5};
//        HashMap<Integer,Integer> map=new HashMap<>();
//        for (int i = 0; i < arrQ6.length; i++) {
//            map.put(arrQ6[i],map.getOrDefault(arrQ6[i],0)+1);
//        }
//        System.out.println(map);
//        Count pairs with given sum
//        int[] arrQ8={1,2,3,4,5,6,7,8};
//        int sum=8;
//        int count=0;
//        HashSet<Integer> set=new HashSet<>();
//        for (int i = 0; i < arrQ8.length; i++) {
//            int diff=sum-arrQ8[i];
//            if (set.contains(diff)){
//                count++;
//            }
//            set.add(arrQ8[i]);
//
//        }
//        System.out.println(count);
        //print subarray
        int[] arr={1,2,3,4,5};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                System.out.print("["+arr[i]+" "+arr[j]+"]");
                System.out.println();
            }
        }
    }
}
