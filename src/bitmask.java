public class bitmask {
    public static void main(String[] args) {
        //get bit
//        int n=5;
//        int pos=3;
//        int bitmask=1<<pos;
//        if((bitmask & pos) == 0){
//            System.out.println("bitmask is zero");
//        }
//        else {
//            System.out.println("bitmask is one");
//        }
        //set bit
//        int n=5;
//        int pos=1;
//        int bitmask=1<<pos;
//        int newNumber=bitmask | n;
//        System.out.println(newNumber);
        //clear bit

        int n=5;
        int pos=2;
        int bitmask=1<<pos;
        int notBit=~(bitmask);
        int newNumber=notBit & n;
        System.out.println(newNumber);
    }
}
