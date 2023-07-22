import java.util.ArrayList;
import java.util.List;

public class Q728 {
    public static void main(String[] args) {
int left=1;
int right=22;
        System.out.println(selfDividingNumbers(left,right));
    }
    public static List<Integer> selfDividingNumbers(int left, int right) {
    List<Integer> list=new ArrayList<>();
        for (int i = left; i <=right ; i++) {
            if (isvalid(i)){
                list.add(i);
            }
        }
    return list;
    }

    private static boolean isvalid(int num) {
        int temp=num;
        while (temp!=0){
            int digit=temp%10;
            temp/=10;
            if (digit==0) return false;
            if (num%digit!=0) return false;

        }
        return true;
    }
}
