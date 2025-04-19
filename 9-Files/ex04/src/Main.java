import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String[] lines = new String[]
                {
                "18,Paul,Robinson,paul.robinson@example.com,38",
                "19,Quincy,Lee,quincy.lee@example.com,39",
                "20,Rachel,Green,rachel.green@example.com,21"
                };

        String path = "/home/alfaneto/Documents/Java-Completo/9-Working-with-Files/ex04/userData.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path, true))) {
            for (String line : lines) {
                // by default write() doesn't go to the next line
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}