import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(23);

        List<Double> doubleList = new ArrayList<>();
        Collections.addAll(doubleList, 23.3, 98.98);


        System.out.println(totalSum(intList));
        System.out.println(totalSum(doubleList));

    }

    public static double totalSum(List<? extends Number> list) {
        double sum = 0;
        int cont = 0;
        for (Number number : list) {
            sum += number.doubleValue();
            cont++;
        }

        return sum;
    }
}