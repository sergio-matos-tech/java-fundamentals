import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(43, 23, 90, 10, 98, 15);

        integerList.stream().map(number -> number * 10).forEach(System.out::println);

        List<String> names = Arrays.asList("Sergio", "Henrique", "Samara", "Matos", "Ribeiro");

        System.out.println();
        names.stream().filter(name -> name.toLowerCase().contains("s"))
                .forEach(System.out::println);

        Stream<Long> stream4 = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1], p[0] + p[1]})
                .map(p -> p[0]);

        System.out.println();
        System.out.println(Arrays.toString(stream4.limit(15).toArray()));
    }
}

