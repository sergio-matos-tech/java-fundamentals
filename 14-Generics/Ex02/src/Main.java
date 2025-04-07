import java.util.List;

public class Main {

    public static void printFirst(List<?> list) {
        if (!list.isEmpty()) {
            System.out.println(list.get(0));
        }
    }

    public static void main(String[] args) {
        List<String> cities = List.of("São Paulo", "Uberlândia", "Rio de Janeiro");
        List<Integer> numbers = List.of(43, 432, 54, 23);
        List<Double> prices = List.of(23.32, 98.23, 87.98);

        printFirst(cities);
        printFirst(numbers);
        printFirst(prices);

    }
}