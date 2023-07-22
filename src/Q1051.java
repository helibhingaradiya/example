import java.util.Arrays;

public class Q1051 {
    public static void main(String[] args) {
        int[] height={1,1,4,2,1,3};
        int[] expected=new int[height.length];
        int count=0;
        for (int i = 0; i < height.length; i++) {
            expected[i]=height[i];
        }
        Arrays.sort(expected);
        for (int i = 0; i < height.length; i++) {
            if (height[i]!=expected[i]){
                count++;
            }
        }
        System.out.println(count);

        System.out.println(Arrays.toString(expected));
//        int front=0;
//        int second=1;
//        int count=0;
//        for (int i = 0; i < height[i]; i++) {
//            if (height[front]<height[second]){
//                second++;
//            }else if(height[front]>height[second]) {
//                int temp=height[front];
//                height[front]=height[second];
//                height[second]=temp;
//                front++;
//                second++;
//                count++;
//            }
//        }
    }
}
