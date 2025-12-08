import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String[] menuOptions = {
                "0. Exit",
                "1. Encrypt a file",
                "2. Decrypt a file"
        };

        int choice = -1;

        do {
            MenuUtil.displayMenu(menuOptions, "AES Encryption Application");

            choice = InputValidator.getValidatedMenuChoice(keyboard, 0, 2);

            switch (choice) {

                case 1:
                    System.out.println("Encrypt file selected.");
                    System.out.println("Enter filename (without .txt):");

                    String fileToEncrypt = InputValidator.getValidatedFilename(keyboard);

                    AESKey encryptKey = KeyUtil.generateRandomKey();

                    AESUtil.encryptFile(fileToEncrypt, encryptKey);

                    String keyToShow =
                            java.util.Base64.getEncoder().encodeToString(encryptKey.getKeyBytes());




                    break;

                case 2:
                    System.out.println("Decrypt file selected.");
                    System.out.println("Enter filename (without .txt):");

                    String fileToDecrypt = InputValidator.getValidatedFilename(keyboard);

                    System.out.println("Enter AES key (Base64):");
                    String base64Key = keyboard.next();

                    byte[] decodedKey =
                            java.util.Base64.getDecoder().decode(base64Key);

                    AESKey decryptKey = new AESKey(decodedKey);

                    String decryptedText = AESUtil.decryptFile(fileToDecrypt, decryptKey);

                    if (decryptedText != null) {
                        System.out.println("Decrypted text:");
                        System.out.println(decryptedText);
                        System.out.println("Plain text was also saved to plaintext.txt");
                    }

                    break;

                default:
                    break;
            }

        } while (choice != 0);

        System.out.println("Exiting...");
    }
}
