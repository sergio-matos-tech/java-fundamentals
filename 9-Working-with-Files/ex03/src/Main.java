import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String userFilePath = "/home/alfaneto/Documents/Java-Completo/9-Working-with-Files/ex03/user.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(userFilePath))) {
            String line;
            System.out.println("FILE CONTENT:");

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } 
    }
}