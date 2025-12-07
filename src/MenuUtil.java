public class MenuUtil {

    public static void displayMenu(String[] options, String title) {
        System.out.println("_____________________________");
        System.out.println(title);
        System.out.println("_____________________________");

        for (String option : options) {
            System.out.println(option);
        }

        System.out.println();
    }
}
