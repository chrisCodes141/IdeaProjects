import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class main {
    public static void main(String[] args) throws IOException
    {
        //Create directory for non existed path.
        //boolean isCreated = newDirectory.mkdirs();
        File ReverseClone = null, dirPath = null;
        String fileName, folderPath;

        File f = new File("C:\\Users\\Krzys\\Desktop\\Test Folder\\theOriginalFile.txt");
        String Fn = f.getName();//.replaceFirst("[.][^.]+$", "");

        ReverseClone = new File("C:\\Users\\Krzys\\Desktop\\Test Folder\\"+reverseString(Fn));

        try{
            ReverseClone.createNewFile();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        Scanner s = new Scanner(f);
        String thestring = "";
        ArrayList<String> als = new ArrayList<>();


        while(s.hasNextLine()){
            //thestring += reverseString(s.nextLine())+"\n";
            als.add(reverseString(s.nextLine()));
        }
        int alsLength = als.size();
        //System.out.println("als Length is: "+alsLength);
        int backwards = alsLength-1;
       // System.out.println("backwards is "+backwards);
        PrintWriter out = new PrintWriter("C:\\Users\\Krzys\\Desktop\\Test Folder\\"+reverseString(Fn)+".txt"); //<<<<<<<<< why this no work?
        for(int i = 0; i < alsLength ; i++){
            //System.out.println("the string in for loop is "+ thestring);
            thestring += als.get(alsLength - i - 1);
            thestring += System.lineSeparator();;
            out.println(thestring); // <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<????????????????????????????????????????????????????
            backwards--;
        }
        out.close();
//        System.out.println(thestring);
//        try (PrintWriter out = new PrintWriter(ReverseClone)) {
//           out.println(thestring);
//        }
        s.close();

    }
    public static String reverseString(String myStr)
    {
        if (myStr.isEmpty()){
            System.out.println("String in now Empty");
            System.out.println("myStr is "+myStr);
            return myStr;
        }
        //Calling Function Recursively
        System.out.println("String to be passed in Recursive Function: "+myStr.substring(1));
        //System.out.println("substring1 :" + myStr.substring(1) + "  charat0: "+myStr.charAt(0));
        return reverseString(myStr.substring(1)) + myStr.charAt(0);
    }
}
