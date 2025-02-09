package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        input.useLocale(Locale.US);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LinkedList<Product> products = new LinkedList<>();

        System.out.print("Enter number of products: ");
        int numberOfProducts = input.nextInt();
        input.nextLine();

        for (int i = 0; i < numberOfProducts; i++) {
            System.out.printf("PRODUCT #%d data: \n", i + 1);
            System.out.print("Common, used or imported? (c/u/i) ");
            char option = input.next().toLowerCase().charAt(0);
            input.nextLine();

            if (option == 'c' || option == 'u' || option == 'i') {
                System.out.print("Name: ");
                String nameOfProduct = input.nextLine();
                System.out.print("Price: $");
                Double priceOfProduct = input.nextDouble();


                if (option == 'c') {
                    Product product = new Product(nameOfProduct, priceOfProduct);
                    products.add(product);
                } else if (option == 'u') {
                    input.nextLine();
                    System.out.print("Manufacture date: (dd/mm/yyyy): ");
                    String dateInput = input.nextLine();
                    LocalDate manufactureDate = LocalDate.parse(dateInput, dateTimeFormatter);
                    Product product = new UsedProduct(nameOfProduct, priceOfProduct, manufactureDate);
                    products.add(product);
                } else {
                    System.out.print("Customs fee: $");
                    Double customsFee = input.nextDouble();
                    input.nextLine();
                    Product product = new ImportedProduct(nameOfProduct, priceOfProduct, customsFee);
                    products.add(product);
                }
            } else {
                System.out.println("ERROR! Enter a valid option next time!");
                i--;
            }
        }

        System.out.println("\nPRICE TAGS: ");
        for (Product product : products) {
            System.out.println(product.priceTag());
        }
        
        input.close();
    }
}