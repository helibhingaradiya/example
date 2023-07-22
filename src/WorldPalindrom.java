public class WorldPalindrom {
    public static void main(String[] args) {
        String str="naman hello";
        String[] arr=str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            char[] ans=arr[i].toCharArray();
            int front=0;
            int last=ans.length-1;
            while (front<last){
                if (ans[front]!=ans[last]){
                    System.out.println("not palindrom");
                    return;
                }
                front++;
                last--;
            }
        }
        System.out.println("palindeom");
    }
}
