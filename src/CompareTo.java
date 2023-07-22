import java.util.Arrays;
import java.util.Comparator;

public class CompareTo {
    public static void main(String[] args) {
        StudentsForSort[] s1=new StudentsForSort[6];
        s1[0]=new StudentsForSort(5,"heli", 89.00);
        s1[1]=new StudentsForSort(4,"mansi", 87.00);
        s1[2]=new StudentsForSort(2,"srushti", 87.50);
        s1[3]=new StudentsForSort(1,"jinal", 87.10);
        s1[4]=new StudentsForSort(3,"riddhi", 82.00);
        s1[5]=new StudentsForSort(7,"heli", 89.00);
        Arrays.sort(s1);
        for (StudentsForSort s:s1) {
            System.out.println(s.name);
        }
    }
}
class StudentsForSort implements Comparable<StudentsForSort>{
    int rno;
    String name;
    double pers;

    public StudentsForSort(int rno, String name, double pers) {
        this.rno = rno;
        this.name = name;
        this.pers = pers;
    }



    @Override
    public int compareTo(StudentsForSort o) {
//        return o.rno-this.rno;
        System.out.println(this.rno + " "  + o.rno);
        if (this.pers>o.pers){
            return 1;
        }
        else if(this.pers<o.pers) {
            return -1;
        }
        return 0;
    }
}
