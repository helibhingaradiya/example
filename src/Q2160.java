public class Q2160 {
    public static void main(String[] args) {
        int num=2932;
        String s=String.valueOf(num);
        int n=s.length()/2;
//        System.out.println(n);
        int front=0;

        String[] numarr=s.split("",2);
        for (int i=0;i<numarr.length;i++)
        {
            System.out.println(numarr[i]);

        }
//        while (num>0){
//            System.out.println(num=num%10);
//            System.out.println(num=num/10);
//        }

    }
}
