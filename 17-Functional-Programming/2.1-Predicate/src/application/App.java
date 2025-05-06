package application;

import entities.Product;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();

        productList.add(new Product("TV", 900.0));
        productList.add(new Product("Laptop", 3200.0));
        productList.add(new Product("Mouse", 50.0));
        productList.add(new Product("Notebook Case", 80.0));

        System.out.println(productList);
        productList.removeIf(product -> product.getPrice() >= 100.0);
        System.out.println("--------------------------------------");
        System.out.println(productList);

    }
}
