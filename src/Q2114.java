public class Q2114 {
    public static void main(String[] args) {
        String[] sentence = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
       int count=0;
       int max=Integer.MIN_VALUE;
        for (int i = 0; i < sentence.length; i++) {
            String str=sentence[i];
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j)==' '){
                    count++;
                }
                if (j==str.length()-1){
                    count++;
                }
                if (count>max){
                    max=count;
                }
            }
            count=0;
        }
        System.out.println(max);
//        int[] nums={1 ,4 ,45, 6, 10, 8};
//        int n=6;
//        int x=13;
//        int front=0;
//        int end=nums.length;
//        while (front<end)
//        {
//
//        }
    }
}
