import java.util.Scanner;

public class Q_Assignment26_2 {
    public static void main(String[] args) {
        Student_1 s1 = new Student_1("helly",12,34,56);
        Student_1 s2 = new Student_1("helly",12,34,56);
        Student_1 s3 = new Student_1("helly",12,34,56);
//        s1.input();
        s1.Show();
        s2.Show();
        s3.Show();
        Student_1.TotalStudent();
        s1.TotalMArks();
        s1.getHighest();
        s1.getLowest();
        s1.getAverage();
        s1.getPassCount();
    }
}

class Student_1 {
    Scanner sc = new Scanner(System.in);
    static int uniq;
    String name;
    int rno;
    int[] marks = new int[5];



    public  Student_1(String name, int m1, int m2, int m3) {
        uniq++;
        this.name = name;
        this.rno = uniq;
        marks[0]=m1;
        marks[1]=m2;
        marks[2]=m3;
    }

    public void input() {
        System.out.println("enter your name:");
        name = sc.next();
        System.out.println("enter your roll number");
        rno = sc.nextInt();
        System.out.println("enter java marks:");
        int m1 = sc.nextInt();
        System.out.println("enter android marks:");
        int m2 = sc.nextInt();
        System.out.println("enter web marks:");
        int m3 = sc.nextInt();
        System.out.println("enter python marks:");
        int m4 = sc.nextInt();
        System.out.println("enter ruby marks:");
        int m5 = sc.nextInt();
        marks[0] = m1;
        marks[1] = m2;
        marks[2] = m3;
        marks[3] = m4;
        marks[4] = m5;

    }

    public void Show() {
        System.out.println("name is: " + name);
        System.out.println("roll number is: " + rno);
        System.out.println("marks is: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i]);
            System.out.println();
        }
    }

    public static void TotalStudent(){
        System.out.println("total number of student is: "+uniq);
    }

    public void TotalMArks() {
        int total = 0;
        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }
        System.out.println("total marks is:" + total);
    }

    public void getHighest() {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < marks.length; i++) {
            if (max < marks[i]) {
                max = marks[i];
            }
        }
        System.out.println("greatest marks is:" + max);
    }

    public void getLowest() {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < marks.length; i++) {
            if (min > marks[i]) {
                min = marks[i];
            }
        }
        System.out.println("lowest marks is:" + min);
    }

    public void getAverage() {
        int total = 0;
        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }
        int avg = total / marks.length;
        System.out.println("average is:" + avg);
    }

    public void getPassCount() {
        int count = 0;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] >= 50) {
                count++;
            }
        }
        System.out.println("you are passed in " + count + " subjects");
    }

}
