import java.util.HashSet;

public class Hashsets
{
    public static void main(String[] args) {
        Students1 s1=new Students1(1,"helly");
        Students1 s2=new Students1(1,"helly");
        HashSet<Students1> set=new HashSet<>();
        set.add(s1);
        if (!set.contains(s2)){
            set.add(s2);
        }


        System.out.println(set);
    }
}
class Students1{
    int id;
    String name;

    @Override
    public String toString() {
        return "Students1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Students1(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
