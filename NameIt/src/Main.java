import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        File f = new File("lol.txt");
        f.createNewFile(); //.cr for quick

        // read from to console
        Scanner s = new Scanner(f);
        System.out.println(s.nextInt());
        System.out.println(s.nextInt());
        System.out.println(s.nextDouble());

        // read from into variables
        int a = s.nextInt();
        int b = s.nextInt();
        double c = s.nextDouble();
        s.close(); // let resources go

        FileWriter fw = new FileWriter(f, true); // append true for adding onto
        fw.append(a + " " + b + " " + c);
        fw.close();

        f.delete(); // to delete file
    }
}
