public class MethodOverridding {
    public static void main(String[] args) {
        Bank sbi=new Sbi();
        System.out.println(sbi.interesRate());
        Bank bob=new Bob();
        System.out.println(bob.interesRate());
    }
}
class Bank{
    int rate;


    public int interesRate() {
        return 0;
    }
}
class Sbi extends Bank{
    public int interesRate() {
        return 4;
    }
}
class Bob extends Bank{
    public int interesRate() {
        return 5;
    }
}
