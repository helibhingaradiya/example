import java.util.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Q1700 {
    public static void main(String[] args) {
        int[] students = {1,1,1,0,0,1};
        int[] sandwiches = {1,0,0,0,1,1};
        System.out.println(countStudents(students, sandwiches));
    }

    public static int countStudents(int[] students, int[] sandwiches) {
        int one=0;
        int zero=0;
        for (int i = 0; i < students.length; i++) {
            if (students[i]==0){
                zero++;
            }else {
                one++;
            }
        }
        for (int i = 0; i < sandwiches.length; i++) {
            if (sandwiches[i]==0 && zero==0){
                return one;
            }else if(sandwiches[i]==1 && one==0) {
                return zero;
            } else if (sandwiches[i]==0) {
             zero--;
            } else if (sandwiches[i]==1) {
                one--;
            }
        }
//        System.out.println(zero);
//        System.out.println(one);
        /*Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> sandwichesQueue=new LinkedList<>();
        for (int i = 0; i < sandwiches.length; i++) {
           sandwichesQueue.add(sandwiches[i]);
        }
        for (int i = 0; i < students.length; i++) {
            queue.add(students[i]);
        }
        while (!sandwichesQueue.isEmpty()){
            if (sandwichesQueue.peek()==queue.peek()){
                sandwichesQueue.remove();
                queue.remove();

            }else{
                while (sandwichesQueue.peek()!=queue.peek()){
                    int temp=queue.peek();
                    queue.remove();
                    queue.add(temp);

                }
            }
        }*/
//        for (int i = 0; i < sandwiches.length; i++) {
//            if (sandwichesStack.peek()!=queue.peek()){
//                sandwichesStack.pop();
//                queue.remove();
//            } else if (sandwichesStack.peek()==queue.peek()) {
//                while (sandwichesStack.peek()==queue.peek()){
//                    int temp=queue.peek();
//                    queue.remove();
//                    queue.add(temp);
//                }
//            }
//        }
//        while (!sandwichesStack.isEmpty()){
//            if (sandwichesStack.peek()!=queue.peek()){
//                sandwichesStack.pop();
//                queue.remove();
//            } else if (sandwichesStack.peek()==queue.peek()) {
//                while (sandwichesStack.peek()==queue.peek()){
//                    int temp=queue.peek();
//                    queue.remove();
//                    queue.add(temp);
//                }
//            }
//        }


//        System.out.println(sandwichesQueue);
//        System.out.println(queue);
//        return queue.size();
        return  -1;
    }
}
