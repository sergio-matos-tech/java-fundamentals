import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
    public static void main(String[] args) {
        NavigableMap<String, String> navigableMap = new TreeMap<>();

        navigableMap.put("A", "Letra A");
        navigableMap.put("D", "Letra D");
        navigableMap.put("C", "Letra C");
        navigableMap.put("B", "Letra B");

        for (Map.Entry<String, String> entry : navigableMap.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }

        System.out.println(navigableMap.headMap("C"));
    }
}
