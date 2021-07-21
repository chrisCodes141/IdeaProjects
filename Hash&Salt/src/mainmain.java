import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class mainmain {
    public static void main(String[] args) {
        // get password
        // make salt
        // apply salt to password
        // encryption algorithm
        // store hashed and salted password
        Scanner in = new Scanner(System.in);

        System.out.println("What would you like your username to be my friend? ");
        String un = in.nextLine();

        System.out.println("Hey you lets store a password securely!/n Please type a password");
        String theirPW = in.nextLine();

        System.out.println("The PW you entered was: " + theirPW);

        String salt = PasswordProtect.generateSALT();

        System.out.println("The salt this time is " + salt);

        String SaltedPass = PasswordProtect.applySalt(theirPW, salt);

        System.out.println("The salted pass is " + SaltedPass);

        String HashedPass = PasswordProtect.hashSaltedPass(SaltedPass);

        System.out.println("The hashed pass is " + HashedPass);

        File f = new File("C:\\Users\\Krzys\\Desktop\\NotafkingBoof\\Legitsht.txt");

        Properties props = new Properties();
        try {
            FileWriter fw = new FileWriter(f);
            /*FileReader fr = new FileReader(f);
            props.load(fr);
            fr.close();*/
            props.setProperty("username", un);
            props.setProperty("salt", salt);
            props.setProperty("HasedPw", HashedPass);

            props.store(fw, "tigolbities");
            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
