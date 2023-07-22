public class Hybrid {
    public static void main(String[] args) {
        Per p1=new Per(1,"helly");
        p1.printDe();
        Emp e1=new Emp(11,"helli",10000);
        e1.printEmp();
        Pr p=new Pr(11,"hhh",345678,"fgg");
        p.printPr();
        S s1=new S(1,"hellli",45);
        s1.printSt();

    }
}
class Per{
    int id;
    String name;

    public Per(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void printDe(){
        System.out.println(this.id+" "+this.name);
    }
}

class Emp extends Per{
    int salary;

    public Emp(int id, String name,int salary) {
        super(id, name);
        this.salary=salary;
    }
    public void printEmp(){
        System.out.println(this.id+" "+this.name+" "+this.salary);
    }
}

class Pr extends Emp{
    String subject;

    public Pr(int id, String name, int salary,String subject) {
        super(id, name, salary);
        this.subject=subject;
    }
    public void printPr(){
        System.out.println(this.id+" "+this.name+" "+this.salary+" "+this.subject);
    }

}

class S extends Per{
    int marks;

    public S(int id, String name,int marks) {
        super(id, name);
        this.marks=marks;
    }
    public void printSt(){
        System.out.println(this.id+" "+this.name+" "+this.marks);
    }
}
