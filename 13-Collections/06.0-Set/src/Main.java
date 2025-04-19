import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();

        set.add("TV");
        set.add("Tablet");
        set.add("Laptop");

        System.out.println(set.contains("Laptop"));

        System.out.println(set);
        System.out.println(set.removeIf(x -> x.length() >= 3));
        System.out.println(set);
    }
}