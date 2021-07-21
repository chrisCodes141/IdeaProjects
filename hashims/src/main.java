import javax.swing.*;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        JFileChooser fc = new JFileChooser();
        int val = fc.showOpenDialog(null);
        if(val == JFileChooser.APPROVE_OPTION)
        {
            File f = fc.getSelectedFile();
            System.out.println(f.getAbsolutePath());
        }
        System.exit(0);
        try{
            String source = "C:\\Users\\Krzys\\Desktop\\Test Folder\\theOriginalFile.txt";
            String target = "C:\\Users\\Krzys\\Desktop\\Test Folder";

            File sourceFile=new File(source);

            Scanner content=new Scanner(sourceFile);
            PrintWriter pwriter =new PrintWriter(target);


            while(content.hasNextLine())
            {
                String s=content.nextLine();
                StringBuffer buffer = new StringBuffer(s);
                buffer=buffer.reverse();
                String rs=buffer.toString();
                pwriter.println(rs);
            }
            content.close();
            pwriter.close();
            System.out.println("File is copied successful!");
        }

        catch(Exception e){
            System.out.println("Something went wrong");
        }
    }
}
