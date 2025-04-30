package application;

import entities.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("TV", 1200.0);
        Product product2 = new Product("Laptop", 3200.0);
        Product product3 = new Product("Headset", 300.0);

        List<Product> productList = new ArrayList<>();

        Collections.addAll(productList, product1, product2, product3);
        productList.sort(new MyComparator());

        System.out.println(productList);
    }
}