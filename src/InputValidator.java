
import java.util.Scanner;

public class InputValidator {

    public static int getValidatedMenuChoice(Scanner keyboard, int min, int max) {

        while (true) {
            System.out.print("Enter choice: ");

            if (keyboard.hasNextInt()) {
                int c = keyboard.nextInt();
                if (c >= min && c <= max) {
                    return c;
                }
            }

            System.out.println("Invalid input. Please try again.");
            keyboard.nextLine();
        }
    }

    public static String getValidatedFilename(Scanner keyboard) {
        System.out.println("Enter filename:");
        String name = keyboard.next();
        return name.endsWith(".txt") ? name : name + ".txt";
    }
}
