import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String[] menuOptions = {
                "0. Exit",
                "1. Encrypt a file",
                "2. Decrypt a file",
        };

        int menuChoice = -1;

        do {
            MenuUtil.displayMenu(menuOptions, "AES encryption menu");
            try {
                menuChoice = MenuUtil.getMenuChoice(menuOptions.length);

                switch (menuChoice) {

                    case 1:
                        System.out.println("Enter the filename to encrypt:");
                        String fileToEncrypt = keyboard.next();
                        AESUtil.encryptFile(fileToEncrypt);
                        break;

                    case 2:
                        System.out.println("Enter the filename to decrypt:");
                        String fileToDecrypt = keyboard.next();
                        System.out.println("Enter AES key:");
                        String key = keyboard.next();
                        AESUtil.decryptFile(fileToDecrypt, key);
                        break;

                    default:
                        break;
                }

            } catch (Exception ex) {
                System.out.println("Invalid option. Please try again.");
            }

        } while (menuChoice != 0);

        System.out.println("Bye!");
    }
}
