package ex02;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);

        System.out.print("\n** PRODUCT DATA **\nName: ");
        String name = input.nextLine();
        System.out.print("Price: $");
        double price = input.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantityInStock = input.nextInt();

        Product product1 = new Product(name, price, quantityInStock);

        product1.processing(1);
        System.out.println(product1);
        System.out.printf("Enter the number of [%ss] to be added in stock: ", product1.getName());
        int quantityToBeAdded = input.nextInt();
        product1.addProducts(quantityToBeAdded);
        product1.processing(1);

        System.out.print("\n** UPDATED **\n");
        System.out.println(product1);

        System.out.printf("Enter the number of [%ss] to be removed from stock: ", product1.getName());
        int numberToBeRemoved = input.nextInt();
        product1.removeProducts(numberToBeRemoved);

        product1.processing(1);
        System.out.print("\n** UPDATED **\n");
        System.out.println(product1);

        input.close();
    }
}
