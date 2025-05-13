package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();

        Collections.addAll(integerList, 1, 2, 3, 4, 5);

        integerList.stream()
                .reduce(Integer::sum)
                .ifPresent(System.out::println);

        integerList.stream()
                .reduce((x, y) -> x * y)
                .ifPresent(System.out::println);


    }
}
