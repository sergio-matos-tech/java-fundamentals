import domain.Smartphone;

public class Main {
    public static void main(String[] args) {
        Smartphone smartphone1 = new Smartphone("1APPLE15", "Apple", "Iphone 15");
        Smartphone smartphone2 = new Smartphone("1APPLE15", "Apple", "Iphone 15 Plus");
        Smartphone smartphone3 = new Smartphone("1APPLE16", "Apple", "Iphone 16");

        System.out.println(smartphone1.equals(smartphone2));
        System.out.println(smartphone1.equals(smartphone3));
    }
}