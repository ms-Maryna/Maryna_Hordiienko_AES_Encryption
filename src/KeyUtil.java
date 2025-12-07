import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class KeyUtil {

    public static AESKey generateRandomKey() {

        try {
            KeyGenerator keyGen = KeyGenerator.getInstance("AES");
            keyGen.init(128); // AES-128
            SecretKey key = keyGen.generateKey();
            return new AESKey(key.getEncoded());
        }
        catch (Exception e) {
            System.out.println("Error generating AES key: " + e.getMessage());
            return null;
        }
    }
}