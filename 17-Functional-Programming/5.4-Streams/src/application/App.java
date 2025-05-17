package application;

import entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        String path = "C:\\Users\\sergi\\Documents\\Java-Completo\\17-Functional-Programming\\5.4-Streams\\products.csv";
        List<Product> products = new ArrayList<>();

       try (BufferedReader br = new BufferedReader(new FileReader(path))) {
           String line = br.readLine();
           while (line != null) {
               String[] fields = line.split(",");
               products.add(new Product(Integer.parseInt(fields[0]), fields[1], Double.parseDouble(fields[2])));
               line = br.readLine();

           }


       } catch (IOException e) {
           throw new RuntimeException(e);
       }

        Double averageDouble = products.stream()
                .map(Product::getPrice)
                .collect(Collectors.averagingDouble(Double::doubleValue));

        System.out.printf("Price Average: R$%.2f%n", averageDouble);

        List<String> productNamesBelowAverage = products.stream()
                .filter(product -> product.getPrice() < averageDouble)
                .map(Product::getName)
                .sorted(Comparator.comparing(String::length))
                .toList();

        System.out.println(productNamesBelowAverage);

    }
}
