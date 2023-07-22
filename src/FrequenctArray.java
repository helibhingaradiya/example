public class FrequenctArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,4,5,5,1,2};
        char[] ch={'a','c','a','b','a','d'};
       char[] arr1=new char[110];
        for (int i = 0; i < ch.length; i++) {
            arr1[ch[i]]++;
        }
        System.out.println(arr1);
    }

}
