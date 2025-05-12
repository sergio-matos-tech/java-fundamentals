import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class App {
    public static void main(String[] args) {
        List<String> names = List.of("Natsu", "Naruto", "Goku");
        List<Integer> integers = map(names, String::length);
        System.out.println(integers);
    }

    private static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();

        for (T e : list) {
            R r = function.apply(e);
            result.add(r);
        }

        return  result;
    }
}
