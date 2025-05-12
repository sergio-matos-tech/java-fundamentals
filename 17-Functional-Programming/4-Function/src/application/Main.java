package application;


import entities.Product;
import util.UpperCaseName;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<Product>();

        products.add(new Product("TV", 900.0, 2));
        products.add(new Product("Tablet", 800.0, 2));
        products.add(new Product("Laptop", 3200.0, 1));
        products.add(new Product("Mouse ", 50.0, 1));

        products.forEach(System.out::println);

        List<String> names = products.stream().map(new UpperCaseName()).toList();
        names.forEach(System.out::println);

    }
}