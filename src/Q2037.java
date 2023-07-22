import java.util.Arrays;

public class Q2037 {
    public static void main(String[] args) {
        int[] seats = {4,1,5,9};
        int[] students = {1,3,2,6};
//        Arrays.sort(students);
        System.out.println(minMovesToSeat(seats, students));
//        int front=0;
//        int end=seat.length;
//        int temp=0;
//        for (int i=0;i<seat.length-1;i++){
//            for (int j=i+1;i<student.length-1;j++){
//                while (front<end) {
//                    temp = student[j];
//                    student[j] = student[j + 1];
//                    seat[i] = temp;
//                }
//            }
//        }
//        for (int i=0;i<seat.length;i++){
//            System.out.println(seat[i]);
//        }
    }

    public static int minMovesToSeat(int[] seats, int[] students) {
        int ans = 0;
Arrays.sort(seats);
        for (int i = 0; i < seats.length; i++) {
            int a=seats[i]-students[i];
            ans+=Math.abs(a);

        }
        return ans;
    }
}
