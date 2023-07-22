public class Q1678 {
    public static void main(String[] args) {
        String command = "G()(al)";
//        String[] arr=command.split("\\(\\)");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
        String ans = "";
        for (int i = 0; i < command.length(); i++) {
            ans += command.charAt(i);
            if (command.charAt(i) == '(' && command.charAt(i + 1) == ')') {
                ans += 'o';
            }
        }
        String a="";
        for (int i = 0; i < ans.length(); i++) {
            if (ans.charAt(i)=='(' || ans.charAt(i)==')'){
                continue;
            }else {
                a+=ans.charAt(i);
            }
        }
        System.out.println(ans);
        System.out.println(a);
    }
}
