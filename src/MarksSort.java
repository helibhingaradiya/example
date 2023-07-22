import java.util.ArrayList;
import java.util.Collections;

public class MarksSort {

    public static void main(String[] args) {
        Student s1 = new Student("helly", 50);
        Student s2 = new Student("jinal", 30);
        Student s3 = new Student("riddhi", 80);
        Student s4 = new Student("yashvi", 70);

        ArrayList<Student> list = new ArrayList<>();
        Collections.sort(list);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        for (Student s:list){
            System.out.println(s.name+" "+s.marks);
        }

    }
}

class Student implements Comparable<Student>{
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
    @Override
    public int compareTo(Student o){
      return marks < o.marks?1:0;
    }
}

