package application;


import entities.Product;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Product, Double> stock = new HashMap<>();

        Product product1 = new Product("TV", 1200.0);
        Product product2 = new Product("Laptop", 3200.0);
        Product product3 = new Product("Tablet", 1000.0);

        stock.put(product1, 10000.0);
        stock.put(product2, 20000.0);
        stock.put(product3, 15000.0);

        Product product4 = new Product("TV", 1200.0);

        System.out.println(stock.containsKey(product4));
    }
}