public class Equaldigitchar {
    public static void main(String[] args) {
        String str="m1 e2";
        char[] arr=str.toCharArray();
        int digit=0;
        int ch=0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i]>=48 && arr[i]<=57){
                digit++;
            }else if(arr[i]==32){

            }else {
                ch++;
            }
        }
        System.out.println("character:"+ch+"digit:"+digit);
        if (digit==ch){
            System.out.println("both are equal");
            return;
        }else {
            System.out.println("not euqal");
        }
    }
}
