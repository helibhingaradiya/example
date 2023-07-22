public class Static {
    public static void main(String[] args) {
     SBI s1=new SBI("varacha");
        System.out.println(s1);
        SBI.setRate(6);
        System.out.println(SBI.rate);
    }
}
class SBI{
    String address;
    static int rate;
    public SBI(String address){
        this.address=address;
    }
    public static void setRate(int i){
        rate=i;
    }
    public String getAddress(){
        return this.address;
    }
}
