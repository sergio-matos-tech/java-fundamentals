import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Product> inventory = new HashMap<>();

        inventory.put(1, new Product("Laptop", 3200.0));
        inventory.put(2, new Product("TV", 13000.0));
        inventory.put(3, new Product("Headphone", 350.0));


        System.out.println("-----------------------------------------------------");
        for (Map.Entry<Integer, Product> entry : inventory.entrySet()) {
            System.out.printf("ID -> %d, Product Name: %s, Product Price $%.2f\n",
                    entry.getKey(), entry.getValue().getName(), entry.getValue().getPrice());
        }
    }
}