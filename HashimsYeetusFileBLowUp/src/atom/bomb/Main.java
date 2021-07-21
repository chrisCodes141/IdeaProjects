package atom.bomb;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main
{
    private static void jarble(File file) throws Exception
    {
        File temp = new File(file.getParent(), file.getName() + ".tmp");
        System.out.println(file);
        System.out.println(temp);
        FileOutputStream fout = new FileOutputStream(temp);
        FileInputStream fin = new FileInputStream(file);
        byte[] tmp = new byte[1024];
        String abc = "123";
        int len;
        while((len = fin.read(tmp)) > 0)
            fout.write(tmp, 0, len);

        fin.close();
        fout.close();
    }

    private static void blowUp(File dir, int tab) throws Exception
    {
        if(dir.isDirectory())
        {
            File[] files = dir.listFiles();

            for (File file : files)
                blowUp(file, tab + 1);
        }
        else
        {
            jarble(dir);
        }
    }

    public static void main(String[] args) throws Exception
    {
        File dir = new File("underwater").getAbsoluteFile();
        System.out.println("Blowing up");
        System.out.println(dir);
        blowUp(dir, 0);
    }
}
