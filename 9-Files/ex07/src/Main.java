import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("File path: ");
        String strPath = input.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(strPath))) {
            File summaryFile = new File(strPath);
            String line;

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(summaryFile.getParent() + File.separator + "summary.csv"))) {
                while ((line = reader.readLine()) != null) {
                    String[] items = line.split(",");

                    String[] productNames = new String[]{items[0]};
                    double fullPrice = Double.parseDouble(items[1]) * Double.parseDouble(items[2]);
                    String[] fullPrices = new String[]{String.valueOf(fullPrice)};

                    writer.write(productNames[0] + "," + fullPrices[0]);
                    writer.newLine();
                }

            } catch (IOException e) {
                System.out.println("ERROR: " + e.getMessage());
            }

        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}