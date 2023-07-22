public class OopsConcept {
    public static void main(String[] args) {
        Students s1 = new Students(1, "helly", 100, 100, 100);
        System.out.println(s1.perc());
        System.out.println();
    }
}

class Students {
    int rno;
    String name;
    int javaMarks;
    int appMark;
    int webMrk;

    public int perc() {
        int total = javaMarks + appMark + webMrk;
        int per = total / 3;
        return per;

    }

    public Students(int rno, String name, int javaMarks, int appMark, int webMrk) {
        this.rno = rno;
        this.name = name;
        this.javaMarks = javaMarks;
        this.appMark = appMark;
        this.webMrk = webMrk;
    }

    public int getRno() {
        return rno;
    }

    public String getName() {
        return name;
    }

    public int getJavaMarks() {
        return javaMarks;
    }

    public int getAppMark() {
        return appMark;
    }

    public int getWebMrk() {
        return webMrk;
    }


}
