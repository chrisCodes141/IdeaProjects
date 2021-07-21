import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class PasswordProtect {

    // make salt
    static String generateSALT() {
        String salt = "";

        SecureRandom SR = new SecureRandom();
        byte[] bs = new byte[64];
        SR.nextBytes(bs);
        String s = new BigInteger(1, bs).toString(16);

        while(s.length() < 128){
            s = "0" + s;
        }

        return s;
    }

    //applying salt (take pw and salt = salt + pw)
    static String applySalt(String pw, String salt){
        String Salted = "";

        Salted += salt.substring(0, salt.length()/2);
        Salted += pw;
        Salted += salt.substring(salt.length()/2);

        return Salted;
    }

    static String hashSaltedPass(String SaltedPass){
        MessageDigest digest = null;
        try {
            digest = MessageDigest.getInstance("SHA-512");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        byte[] encodedhash = digest.digest(
                SaltedPass.getBytes(StandardCharsets.UTF_8));

        String s = new BigInteger(1, encodedhash).toString(16);

        while(s.length() < 128){
            s = "0" + s;
        }
        return s;
    }
}

