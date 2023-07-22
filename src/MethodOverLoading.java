public class MethodOverLoading {
    public static void main(String[] args) {
        int a = 1;
        int b = 3;
        int c = 5;
        double e=2.0;
        double f= 3.0F;
        //different arguments
        Studs s1 = new Studs();
        System.out.println(s1.sum(a, b));
        System.out.println(s1.sum(a, b, c));
        //return  type
        System.out.println(s1.sum(e,f));

    }
}

class Studs {
    public int sum(int a, int b) {
        return a + b;
    }

    public int sum(int a, int b, int c) {
        return a + b + c;
    }
    public double sum(double a,double b){
        return a+b;
    }
}
