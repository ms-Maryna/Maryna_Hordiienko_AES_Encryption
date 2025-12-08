import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileUtil {

    public static String readTextFromFile(String filename) throws Exception {
        File f = new File(filename);

        Scanner s = new Scanner(f);
        s.useDelimiter("\\Z"); // read whole file
        return s.next();
    }

    public static void writeTextToFile(String filename, String contents) throws Exception {
        FileWriter fw = new FileWriter(filename);
        fw.write(contents);
        fw.close();
    }
}