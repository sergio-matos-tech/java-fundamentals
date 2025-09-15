package org.api;

import org.api.calculator.PriceCalculator;
import org.api.factory.ProductFactory;
import org.api.model.CustomerLevel;
import org.api.model.Item;
import org.api.model.Order;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // --- Cenário 1: Produto BasicBR ---
        System.out.println("--- Testando Produto: BasicBR (MG) ---");
        Item item1 = new Item("Produto A", "100.00", 2); // Subtotal = 200.00
        Order order1 = new Order(List.of(item1), "MG", CustomerLevel.STANDARD, null);

        PriceCalculator basicBR = ProductFactory.createBasicBR();
        BigDecimal total1 = basicBR.total(order1);
        System.out.println("TOTAL DO PEDIDO 1: " + NumberFormat.getCurrencyInstance().format(total1));
        System.out.println("----------------------------------------\n");

        // --- Cenário 2: Produto PromoBR (SP com cupom) ---
        System.out.println("--- Testando Produto: PromoBR (SP, Cupom PROMO10) ---");
        Item item2 = new Item("Produto B", "300.00", 1); // Subtotal = 300.00
        Order order2 = new Order(List.of(item2), "SP", CustomerLevel.STANDARD, "PROMO10");

        PriceCalculator promoBR = ProductFactory.createPromoBR();
        BigDecimal total2 = promoBR.total(order2);
        System.out.println("TOTAL DO PEDIDO 2: " + NumberFormat.getCurrencyInstance().format(total2));
        System.out.println("----------------------------------------\n");

        // --- Cenário 3: Produto FullBR (RJ, GOLD, com frete) ---
        System.out.println("--- Testando Produto: FullBR (RJ, GOLD, com frete) ---");
        Item item3 = new Item("Produto C", "50.50", 2); // 101.00
        Item item4 = new Item("Produto D", "20.00", 1); // 20.00
        // Subtotal = 121.00
        Order order3 = new Order(List.of(item3, item4), "RJ", CustomerLevel.GOLD, "PROMO10");

        PriceCalculator fullBR = ProductFactory.createFullBR();
        BigDecimal total3 = fullBR.total(order3);
        System.out.println("TOTAL DO PEDIDO 3: " + NumberFormat.getCurrencyInstance().format(total3));
        System.out.println("----------------------------------------\n");

        // --- Cenário 4: Produto FullBR (RJ, GOLD, frete grátis) ---
        System.out.println("--- Testando Produto: FullBR (RJ, GOLD, frete grátis) ---");
        Item item5 = new Item("Produto E (Caro)", "350.00", 1); // Subtotal = 350.00
        Order order4 = new Order(List.of(item5), "RJ", CustomerLevel.GOLD, "PROMO10");

        // Reusa o mesmo "produto" de software (o objeto calculator)
        BigDecimal total4 = fullBR.total(order4);
        System.out.println("TOTAL DO PEDIDO 4: " + NumberFormat.getCurrencyInstance().format(total4));
        System.out.println("----------------------------------------\n");
    }
}