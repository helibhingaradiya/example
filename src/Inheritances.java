public class Inheritances{
    public static void main(String[] args) {
        STudents s=new STudents(1,"helly",25);
        s.display();
    }
}
class person{
    private int id;
    private String name;
    public  person(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
}
class STudents extends person{
    int marks;

    public STudents(int id, String name,int marks) {
        super(id, name);
        this.marks=marks;
    }

    public void display(){
        System.out.println(getId()+" "+getName()+" "+marks);
    }

}
