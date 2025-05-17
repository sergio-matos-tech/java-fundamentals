package application;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Test03 {
    public static void main(String[] args) {

        System.out.println(Runtime.getRuntime().availableProcessors());

        long num = 100_000_000;

        sumParallelStreamIterate(num);
        sumParallelLongStream(num);

    }

    public static void sumParallelStreamIterate(long num) {
        System.out.println("Sum stream iterate parallel ");

        long begin = System.currentTimeMillis();
        long result = Stream.iterate(1L, i -> i + 1).limit(num).parallel()
                .reduce(0L, Long::sum);
        long end = System.currentTimeMillis();

        System.out.println(result + " " + (end - begin) + "ms");
    }

    public static void sumParallelLongStream(long num) {
        System.out.println("Sum parallel Long stream");

        long begin = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L, num).parallel()
                .reduce(0L, Long::sum);
        long end = System.currentTimeMillis();

        System.out.println(result + " " + (end - begin) + "ms");
    }
}
