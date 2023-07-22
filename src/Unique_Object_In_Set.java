import java.util.HashSet;
import java.util.Objects;

public class Unique_Object_In_Set {
    public static void main(String[] args) {
        HashSet<Stud1> set=new HashSet<>();
        Stud1 s1=new Stud1(1,"helly");
        Stud1 s2=new Stud1(1,"helly");
        Stud1 s3=new Stud1(1,"helly");

        set.add(s1);
        set.add(s2);
        set.add(s3);
        System.out.println("size: "+set.size());
    }
}
class Stud1{
    int rno;
    String name;

    public Stud1(int rno, String name) {
        this.rno = rno;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stud1 stud1 = (Stud1) o;
        return rno == stud1.rno && Objects.equals(name, stud1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rno, name);
    }
}
