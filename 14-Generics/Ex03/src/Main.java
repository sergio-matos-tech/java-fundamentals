import java.util.List;

public class Main {

    public static double sumList(List<? extends Number> list) {
        double sum = 0;
        if (!list.isEmpty()) {
            for (Number num : list) {
                sum += num.doubleValue();
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> integerList = List.of(23, 43, 23, 43);
        List<Double> doubleList = List.of(32.453, 43.34, 98.8);

        System.out.println(sumList(integerList));
        System.out.println(sumList(doubleList));
    }
}