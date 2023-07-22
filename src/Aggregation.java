public class Aggregation {
    public static void main(String[] args) {
        Address a1=new Address(1,"surat","gujarat","india");
        St s1=new St(1,"helly",a1);
        s1.printAdd();
    }
}
class Address
{
    int pin;
    String city;
    String state;
    String country;

    public Address(int pin, String city, String state, String country) {
        this.pin = pin;
        this.city = city;
        this.state = state;
        this.country = country;
    }
}
class St{
    int id;
    String name;
    Address address;

    public St(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    public void printAdd()
    {
        System.out.println(this.id+" "+this.name+" "+this.address.pin+" "+this.address.city);
    }
}
