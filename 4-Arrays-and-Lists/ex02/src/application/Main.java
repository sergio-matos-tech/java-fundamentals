package application;

import entities.Product;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double sumOfPrices = 0;
        System.out.print("Enter the amount of products to be added: ");
        int n = input.nextInt();
        input.nextLine();
        Product[] products = new Product[n];

        for (int i = 0; i < n; i++) {
            products[i] = new Product();
            System.out.printf("\nEnter the name of the %dº product: ", i + 1);
            products[i].setName(input.nextLine());
            System.out.printf("Enter the price of the %d° product: $", i + 1);
            products[i].setPrice(input.nextDouble());
            input.nextLine();
            sumOfPrices += products[i].getPrice();
        }

        System.out.println(Arrays.toString(products));
        System.out.println("AVERAGE PRICE = $" + (sumOfPrices / n));

        input.close();
    }
}