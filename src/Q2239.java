public class Q2239 {
    public static void main(String[] args) {
  String A="mpampamm";
        System.out.println(solve(A));

// String s="restart";
//        char firstChar = s.charAt(0);
//        StringBuilder result = new StringBuilder();
//        result.append(firstChar);
//        for (int i = 1; i < s.length(); i++) {
//            char currentChar = s.charAt(i);
//            if (currentChar == firstChar) {
//                result.append('$');
//            } else {
//                result.append(currentChar);
//
//            }
//        }
//        System.out.println(result);
//        int i = 0;
//
//        while(i < 4){
//
//            if(i % 2 == 0){
//
//                System.out.print("yes");
//
//            }else{
//
//                System.out.print("no");
//
//            }
//
//            i += 2;
//
//        }
//        for(int i = 0; i <= 10; i++) {
//
//            if(i % 2 == 0) {
//
//                continue;
//
//            }
//
//            System.out.println(i);
//
//        }
//        int i = 0;
//
//        for(i = 0; i < 10; i++) {
//            break;
//        }
//        System.out.println(i);
    }
    public static int solve(String A) {
        int pCount = 0;
        int aCount = 0;
        int mCount = 0;

        for (char ch : A.toCharArray()) {
            if (ch == 'p') {
                pCount++;
            } else if (ch == 'a') {
                aCount++;
            } else if (ch == 'm') {
                mCount++;
            }
        }

        return (pCount == aCount  &&  mCount == aCount*2) ? 1 : 0;

    }
}
