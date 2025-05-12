package application;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ana", "Carlos", "Henrique", "Bob");

        names.stream().filter(name -> name.startsWith("C"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }

}
