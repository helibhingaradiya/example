public class Interface {
    public static void main(String[] args) {
        Prof p1 = new Prof();
        p1.printName();
        p1.printNameEm();
        Stu s1=new Stu();
        s1.printName();
    }
}

interface Persons1 {
    public void printName();
}

interface Employee {
    public void printNameEm();
}

class Prof implements Persons1, Employee {
    public void printName() {
        System.out.println("name");
    }

    @Override
    public void printNameEm() {
        System.out.println("employee");
    }


}

class Stu implements Persons1{
    public void printName() {
        System.out.println("name of students");
    }
}
