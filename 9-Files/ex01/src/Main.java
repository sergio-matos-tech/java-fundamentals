import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String home = System.getProperty("user.home");
        File file = new File(home + "/Documents/Java-Completo/9-Working-with-Files/ex01/teste.txt");

        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            // this line is like "if (scanner != null) then..."
            assert scanner != null;
            scanner.close();
        }
        System.out.println(file.length());
    }
}