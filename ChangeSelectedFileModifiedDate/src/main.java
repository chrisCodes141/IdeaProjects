import java.io.File;
import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        System.out.println("What is the file name? (no extension)");
        String fileName = s.nextLine();
        //fileName +=
        File f = new File("C:\\Users\\Krzys\\Desktop\\Chapters13 and 14\\Chapter14"+fileName+".mpp");

        Date d = new Date();
        d.getTime();
        System.out.println(d);
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        System.out.println("Original Last Modified Date : "
                + sdf.format(f.lastModified()));

        //set this date
        String newLastModified = "11/31/1998";

        //need convert the above date to milliseconds in long value
        Date newDate = sdf.parse(newLastModified);
        f.setLastModified(newDate.getTime());

        //print the latest last modified date
        System.out.println("Lastest Last Modified Date : "
                + sdf.format(f.lastModified()));

    }/*catch(ParseException e){

        e.printStackTrace();

    }*/
}

