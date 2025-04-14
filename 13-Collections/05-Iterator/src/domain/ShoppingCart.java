package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ShoppingCart {
    private final List<Item> items = new ArrayList<>();

    public void addItem(Item i) {
        items.add(i);
    }



    public double getTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item.getName() + " - R$" + item.getPrice());
        }
    }

    public void removeItemByName(Item item, String name) {
        items.removeIf(i -> i.equals(item));
    }

}
