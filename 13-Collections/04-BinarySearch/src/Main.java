import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 2, 0, 4, 3, 5, 6, 7, 9, 10);

        Collections.sort(numbers);
        System.out.println(numbers);

        System.out.println(Collections.binarySearch(numbers, 7));
    }
}