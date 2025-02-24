import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String home = System.getProperty("user.home");
        String path = home + "/Documents/Java-Completo/9-Working-with-Files/ex02/test02";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line = bufferedReader.readLine();

            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}