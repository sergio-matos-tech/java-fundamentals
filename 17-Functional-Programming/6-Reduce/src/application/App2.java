package application;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App2 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 50)
                .filter(n -> n % 6 == 0)
                .forEach(System.out::println);

        Stream.of("Eleven", "Sergio", "Henrique", "Kakaroto")
                .map(String::toUpperCase)
                .forEach(System.out::println);


        int[] num = IntStream.rangeClosed(0, 10).toArray();

        Arrays.stream(num)
                .average().
                ifPresent(System.out::println);

        System.out.println();

        try (Stream<String> lines = Files.lines(Paths.get("champions.txt"))) {
            lines.filter(l -> l.toLowerCase().contains("java"))
                    .forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
