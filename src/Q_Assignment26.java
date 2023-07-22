public class Q_Assignment26 {
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.gearChange();
        bike.gearChange();
        Bicycle bicycle = new Bicycle("abc",7);
        bicycle.gearChange();
        Car car = new Car("rols roy",3);
    }
}

interface Vehical {

    public void gearChange();
}

class Bicycle implements Vehical {
    static int max_gear=2;
    String name;
    int gear;

    public Bicycle(String name, int gear) {
        this.name = name;
        this.gear = gear;
    }

    public int getGear() {
        return gear;
    }

    public void gearChange() {
        if (this.gear==max_gear){
            System.out.println("not apply");
            return;
        }
        gear++;
    }
}

class Bike implements Vehical {
    static int max_gear=5;
    String name;
    int gear;

    public int getGear() {
        return gear;
    }

//    public Bike(String name, int gear) {
//        this.name = name;
//        this.gear = gear;
//    }

    public void gearChange() {
        if (this.gear==max_gear){
            System.out.println("not apply");
            return;
        }
        gear++;
    }
}

class Car implements Vehical {
    static int max_gear=7;
    String name;
    int gear;

    public int getGear() {
        return gear;
    }

    public Car(String name, int gear) {
        this.name = name;
        this.gear = gear;
    }

    public void gearChange() {
        if (this.gear==max_gear){
            System.out.println("not apply");
            return;
        }
        gear++;
    }
}
