public class Q657 {
    public static void main(String[] args) {
        String moves="UDD";
        int up=0;
        int left=0;
        for (char ch:moves.toCharArray()) {
            if (ch=='U'){
                up++;
            } else if (ch=='L') {
                left++;
            } else if (ch=='D') {
                up--;
            }else {
                left--;
            }
        }

        if (up==0 && left==0){
            System.out.println(true);
        }

























//        if ( moves == "UD" || moves == "LR" || moves=="DU" || moves=="RL"){
//            System.out.println("true");
//
//        }else{
//            System.out.println("false");
//        }
//        int[] arr = {1, 2, 3, 4, 5,7};
//        int k = 7;
//        int front = 0;
//        int end = arr.length ;
//        System.out.println(end);
//        while (front < end) {
//            int mid = front + (end - front) / 2;
//            if (arr[mid] == k) {
//                System.out.println(mid);
//            }
//            if (k < arr[mid]) {
//                end = mid - 1;
//            } else {
//                front = mid + 1;
//            }
//        }
    }
}
