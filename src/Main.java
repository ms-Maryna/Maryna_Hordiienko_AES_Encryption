import java.util.Scanner;



public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String[] menuOptions = {
                "0. Quit",
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

                    // Ask user for filename
                    String fileToEncrypt = InputValidator.getValidatedFilename(keyboard);

                    // Generate random AES key
                    AESKey encryptKey = KeyUtil.generateRandomKey();

                    // Encrypt the file
                    AESUtil.encryptFile(fileToEncrypt, encryptKey);

                case 2:
                    System.out.println("Decrypt file selected.");

                    // Ask user for filename (ciphertext file)
                    String fileToDecrypt = InputValidator.getValidatedFilename(keyboard);

                    // Ask user for AES key in Base64
                    System.out.println("Enter AES key (Base64):");
                    String base64Key = keyboard.next();

                    // Convert Base64 string → byte[]
                    byte[] decodedKey = java.util.Base64.getDecoder().decode(base64Key);

                    // Create AESKey object
                    AESKey decryptKey = new AESKey(decodedKey);

                    // Decrypt the file
                    AESUtil.decryptFile(fileToDecrypt, decryptKey);

                    default:
                    break;
            }

        } while (choice != 0);

        System.out.println("Exiting...");
    }
}