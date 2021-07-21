import java.io.File;
import java.io.IOException;
import java.util.Scanner;

// to activate go all the way into ideal project > projectname>src (where this file lies)
// cmd > javacEditor.java (should print another duplicate line ? success : throws error
// java Editor  (indicator should go to border, you can use the commands)

public class Editor
{
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String cmd;
        while(!(cmd = in.next()).equalsIgnoreCase("exit")) // in.next() is to the next space ' '
        {
            if(cmd.equalsIgnoreCase("add"))
            {
                int a = in.nextInt();
                int b = in.nextInt();
                System.out.println("Adding numbers: " + (a + b));
            }
            else if(cmd.equalsIgnoreCase("createFile"))
            {
                File f = new File(in.next());
                if(f.exists())//if(!f.exists()){ for not
                {
                    System.out.println("The file already exists.");
                }
                else
                    {
                        f.createNewFile();
                    }
            }
            else if(cmd.equalsIgnoreCase("exists"))
            {
                File f = new File(in.next());
                System.out.println("This file does " + (f.exists() ? "" : "not ") + "exist.");
            }
            else if(cmd.equalsIgnoreCase("delete"))
            {
                File f = new File(in.next());
                if(f.exists())
                {
                    f.delete();
                    System.out.println("The file " + f.getName() + " has been deleted");
                }
                else
                {

                }
            }
            else
            {
                System.out.println("Unknown command: " + cmd);
            }
        }
        in.close();
    }
}
