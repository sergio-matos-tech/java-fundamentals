import entities.Smartphone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Smartphone> smartphones = new ArrayList<>();
        Smartphone smartphone1 = new Smartphone("2332", "Apple");
        Smartphone smartphone2 = new Smartphone("8080", "Samsung");
        Smartphone smartphone3 = new Smartphone("4343", "Motorola");
        smartphones.add(smartphone1);
        smartphones.add(smartphone2);
        smartphones.add(smartphone3);

        for (Smartphone s : smartphones) {
            System.out.println("Serial Number: " + s.getSerialNumber() + "Brand: " + s.getBrand());
        }
        Collections.sort(smartphones);
        System.out.println();
        for (Smartphone s : smartphones) {
            System.out.println("Serial Number: " + s.getSerialNumber() + "Brand: " + s.getBrand());
        }
    }
}