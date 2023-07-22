public class MultiLevel {
    public static void main(String[] args) {
        Proffesor p1=new Proffesor(1,"helly","abc",1000);
        p1.display();
    }
}
class Person{
    int id;
    String name;
}

class Employe extends Person{
    String dept;
}
class Proffesor extends Employe{
    int salary;
    Proffesor(int id,String name,String dept,int salary)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.dept=dept;
    }
    void display(){
        System.out.println(id+" "+name+" "+salary+" "+dept);
    }
}
