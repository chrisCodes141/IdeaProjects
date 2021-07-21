import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class StringReverse
{
    public static void main(String[] args) throws Exception
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter input file:");

        File file = new File(in.nextLine());
        in.close();
        if(!file.exists() || file.isDirectory())
        {
            Exception e = new Exception();
            e.printStackTrace(System.err);
            System.err.println("Invalid file passed!");
            System.exit(0);
        }

        Scanner fin = new Scanner(file);
        fin.useDelimiter("|");

        StringBuilder sb = new StringBuilder();
        while(fin.hasNext())
        {
            sb.append(fin.next());
        }
        System.out.println(sb);
        fin.close();

        String s = sb.reverse().toString();

        s = s.replace("\n", "\r\n");

        FileWriter fout = new FileWriter(new File(file.getPath() + ".rev"));
        fout.write(s);
        fout.close();

    }
}
