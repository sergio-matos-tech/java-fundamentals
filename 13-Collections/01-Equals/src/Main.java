import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        List<Smartphone> smartphones = new ArrayList<>();
        Smartphone smartphone1 = new Smartphone("1APPLE15", "Apple", "Iphone 15");
        Smartphone smartphone2 = new Smartphone("1APPLE15", "Apple", "Iphone 15 Plus");
        Smartphone smartphone3 = new Smartphone("1APPLE16", "Apple", "Iphone 16");
        Collections.addAll(smartphones, smartphone1, smartphone2, smartphone3);
        System.out.println(smartphones);


        System.out.println(smartphone1.equals(smartphone2));
        System.out.println(smartphone1.equals(smartphone3));

        smartphones.removeIf(s -> s.equals(smartphone2));


        System.out.println(smartphones);

    }
}