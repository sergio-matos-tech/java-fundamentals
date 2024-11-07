package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Main {
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        String name;
        double price;
        int quantity, quantityToBeAdded;

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        name = input.nextLine();
        System.out.print("Price: $");
        price = input.nextDouble();
        System.out.print("Quantity in stock: ");
        quantity = input.nextInt();

        Product product = new Product(name, price);
        product.addProducts(quantity);

        System.out.println("\nProduct data: \n" + product);

        System.out.print("\nEnter the number of products to be added in stock: ");
        quantityToBeAdded = input.nextInt();
        product.addProducts(quantityToBeAdded);

        System.out.println("\nUpdated data: " + product);

        System.out.print("\nEnter the number of products to be removed from stock: ");
        quantity = input.nextInt();
        product.removeProducts(quantity);

        System.out.println("\nUpdated data: " + product);

        input.close();
    }
}