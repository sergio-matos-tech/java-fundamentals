import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(6, 9, 2, 3, 1, 5);

        Stream<Integer> integerStream = integerList.stream().map(number -> number * 10);
        System.out.println(Arrays.toString(integerStream.toArray()));

        int sum = integerList.stream().reduce(0, Integer::sum);
        System.out.println(sum);

        List<Integer> integerList1 = integerList.stream()
                .filter(x -> x % 2 == 0)
                .map(y -> y * 10)
                .toList();

        System.out.println(Arrays.toString(integerList1.toArray()));
    }
}
