import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a folder path: ");
        String strPath = input.nextLine();

        File path = new File(strPath);

        File[] directories = path.listFiles(File::isDirectory);
        System.out.println("Directories: ");

        if (directories != null) {
            for (File directory : directories) {
                System.out.println(directory);
            }
        } else {
            System.out.println("The path doesn't exist or isn't a directory.");
        }

        input.close();
    }
}