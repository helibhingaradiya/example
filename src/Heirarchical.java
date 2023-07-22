public class Heirarchical {
    public static void main(String[] args) {
        Stud s=new Stud(1,"helly",76);
        s.display();
        Proff p=new Proff(1,"helly",7680);
        p.display();
    }
}

class Persons{
    int id;
    String name;
}

class Stud extends Persons{
    int marks;

    public Stud(int id,String name,int marks) {
        this.id=id;
        this.name=name;
        this.marks = marks;
    }
    void display(){
        System.out.println(id+" "+name+" "+marks);
    }
}
class Proff extends Persons
{
    int salary;
    public Proff(int id,String name,int salary) {
        this.id=id;
        this.name=name;
        this.salary = salary;
    }
    void display(){
        System.out.println(id+" "+name+" "+salary);
    }
}
