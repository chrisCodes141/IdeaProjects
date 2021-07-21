import java.io.*;

public class main {
    public static void main(String[] args) throws IOException {
        File f = new File("numsList.txt");
        int sum = 0;

        BufferedReader bf = new BufferedReader(new FileReader(f));

        while(true) {

            String line = bf.readLine();

            if (line == null) {
                break;
            }
            sum += Integer.parseInt(line);
            System.out.println(line);
        }
        System.out.println("sum: " +sum);
        bf.close();


    }
}
