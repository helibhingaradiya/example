public class Q2496 {
    public static void main(String[] args) {
        String[] strs={"alic3","bob","3","4","00000"};
        System.out.println(maximumValue(strs));
    }
    public static int maximumValue(String[] strs) {
        for (int i = 0; i < strs.length; i++) {
            char[] arr=strs[i].toCharArray();
            if (arr[i]>=48 && arr[i]<=122){
                return arr.length;
            }
            if (arr[i]>48 && arr[i]<57){
                return arr[i];
            }
        }
        return 1;
    }
}
