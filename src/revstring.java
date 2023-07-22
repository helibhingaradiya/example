public class revstring {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("helly patel");
        int front=0;
        int back=sb.length()-1;
        for(int i=0;i<sb.length()/2;i++){

            char frontChar=sb.charAt(front);
            char backChar=sb.charAt(back);

            sb.setCharAt(front,backChar);
            sb.setCharAt(back,frontChar);
            front++;
            back--;
        }
        System.out.println(sb);
    }
}
