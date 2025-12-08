import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class AESUtil {

    public static void encryptFile(String filename, AESKey key) {

        System.out.println("Encrypting file: " + filename);

        try {
            String plainText = FileUtil.readTextFromFile(filename);

            SecretKeySpec secretKey = new SecretKeySpec(key.getKeyBytes(), "AES");

            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);

            byte[] encryptedBytes = cipher.doFinal(plainText.getBytes());

            String base64Cipher = Base64.getEncoder().encodeToString(encryptedBytes);

            FileUtil.writeTextToFile("ciphertext.txt", base64Cipher);

            System.out.println("File encrypted successfully.");
            System.out.println("Key (Base64): " + Base64.getEncoder().encodeToString(key.getKeyBytes()));
            System.out.println("Please save this key. You will need it to decrypt the file.");
        } catch (Exception e) {
            System.out.println("Encryption error: " + e.getMessage());
        }
    }


    public static String decryptFile(String filename, AESKey key) {

        System.out.println("Decrypting file: " + filename);

        try {
            String cipherBase64 = FileUtil.readTextFromFile(filename);
            byte[] cipherBytes = Base64.getDecoder().decode(cipherBase64);

            SecretKeySpec secretKey = new SecretKeySpec(key.getKeyBytes(), "AES");

            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.DECRYPT_MODE, secretKey);

            byte[] decryptedBytes = cipher.doFinal(cipherBytes);

            String plainText = new String(decryptedBytes);

            FileUtil.writeTextToFile("plaintext.txt", plainText);

            System.out.println("File decrypted successfully.");

            return plainText;

        } catch (Exception e) {
            System.out.println("Decryption error: " + e.getMessage());
            return null;
        }
    }
}