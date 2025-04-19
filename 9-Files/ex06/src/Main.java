import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a directory path:" );
        String strPath = input.nextLine();

        File path = new File(strPath);

        File[] files = path.listFiles(File::isFile);
        System.out.println("FILES: ");

        if (files != null) {
            for (File file : files) {
                System.out.println(file);
            }
        } else {
            System.out.println("The path doesn't exist or there is no file in that directory");
        }

        input.close();
    }
}