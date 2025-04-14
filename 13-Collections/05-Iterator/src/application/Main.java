package application;

import domain.Item;
import domain.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Item item1 = new Item("Laptop", 3000.0, true);
        Item item2 = new Item("Mouse", 150.0, false);
        Item item3 = new Item("Keyboard", 200.0, true);
        Item item4 = new Item("Monitor", 1000.0, false);

        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);
        cart.addItem(item4);

        cart.printItems();
        System.out.println();
        cart.printItems();
    }
}