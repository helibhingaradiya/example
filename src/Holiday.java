import java.util.Arrays;

public class Holiday {
    public static void main(String[] args) {
        Holydays h1=new Holydays("helly",3,"july");
        Holydays h2=new Holydays("Independence day",4,"july");

        Holydays[] arr=new Holydays[2];
        arr[0]=h1;
        arr[1]=h2;
        System.out.println(h1.avgDate(arr));
        System.out.println(Arrays.toString(arr));
        System.out.println(h1.isSameMonth(h2.getMonths()));

    }




}

class Holydays{
    private String name;
    private int days;
    private  String months;
    public double avgDate(Holydays arr[]){
        int days=0;
        for (Holydays h:arr) {
           int a= h.getDays();
            days+=a;
        }

        return days/arr.length;
    }
    public boolean isSameMonth(String m2){
        if (months.equals(m2)){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Holydays{" +
                "name='" + name + '\'' +
                ", days=" + days +
                ", months='" + months + '\'' +
                '}';
    }

    Holydays(){};

    public void setName(String name) {
        this.name = name;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public void setMonths(String months) {
        this.months = months;
    }

    Holydays(String name, int days, String months){
        this.name=name;
        this.days=days;
        this.months=months;
    }

    public String getName() {
        return name;
    }

    public int getDays() {
        return days;
    }

    public String getMonths() {
        return months;
    }
}