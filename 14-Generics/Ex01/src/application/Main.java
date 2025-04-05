package application;

import entities.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        Product product1 = new Product("Iphone", "Apple", 5000.0);
        Product product2 = new Product("Inspiron 15", "Dell", 3500.0);
        Product product3 = new Product("PS5", "Sony", 3000.0);

        Collections.addAll(productList, product1, product2, product3);
        System.out.println(productList);
        Collections.sort(productList);
        System.out.println(productList);


        Product mostExpensiveProduct = Collections.max(productList);
        System.out.println(mostExpensiveProduct);
    }
}