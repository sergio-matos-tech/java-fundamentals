package application;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class App3 {
    public static void main(String[] args) {

        Stream.iterate(1, n -> n * 10)
                .limit(10)
                .forEach(System.out::println);


        Stream.iterate(new Object(), Object::hashCode)
                .limit(10)
                .forEach(System.out::println);

        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
        System.out.println(threadLocalRandom);

        Stream.generate(() -> threadLocalRandom.nextInt(1, 100))
                .limit(10)
                .forEach(System.out::println);


    }
}
