public class Movie {
    public static void main(String[] args) {
        Movies m1 = new Movies("Casino Royal", "Eno Productions", "PG-13");
        Movies m2 = new Movies("Casino", "Eno Productions", "PG-13");
        Movies m3 = new Movies("Royal", "Eno Productions", "PG-13");
        Movies m4 = new Movies("Casino Royal", "Eno Productions", "aG-13");
        Movies m5 = new Movies("Casino Royal", "Eno Productions", "aG-13");
        Movies[] arr = new Movies[5];
        arr[0] = m1;
        arr[1] = m2;
        arr[2] = m3;
        arr[3] = m4;
        arr[4] = m5;
        m1.display();
        Movies[] newArray = m1.getPg(arr);
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i].getTitle());
        }
    }
}

class Movies {
    private String title;
    private String studio;
    private String rating;

    Movies(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    void display() {

        System.out.println(title);
        System.out.println(studio);
        System.out.println(rating);


    }

    Movies[] getPg(Movies[] arr) {
        int count = 0;
        for (Movies m : arr) {
            if (m.getRating() == "PG-13") {
                count++;
            }
        }
        Movies[] m1 = new Movies[count];
        int i = 0;
        for (Movies m : arr) {
            if (m.getRating() == "PG-13") {
                m1[i] = m;
                i++;
            }
        }
        return m1;
    }

    public String getRating() {
        return rating;
    }

    public String getTitle() {
        return title;
    }

    public String getStudio() {
        return studio;
    }
}
