class student {
    String name;
    Integer rollno;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.rollno);
    }

    //non-parametrized constructor
    student(){

    }
    //parametrazied constructor

//    student(String name,int rollno){
//        this.name=name;
//        this.rollno=rollno;
//    }

    //copy constructor

  student(student s2){
        this.name=s2.name;
        this.rollno=s2.rollno;
  }
}

public class Opps {
    public static void main(String[] args) {
        student s1=new student();
        s1.name="helly";
        s1.rollno=404;
         student s2=new student(s1);

         s2.printInfo();


    }
}
