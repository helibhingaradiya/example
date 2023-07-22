import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter line");
        String line=sc.nextLine();
        System.out.println("enter word");
        String word=sc.next();
        System.out.println("line is"+ line.length());
        System.out.println("word is"+ word.length());
        String name="helly"
                ;

        for (int i=0;i<name.length();i++){
            System.out.println(name.charAt(i));
        }

    }
}
