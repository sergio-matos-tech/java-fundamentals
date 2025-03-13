package entities;

public interface DataLoader {
    void load();
    default void checkPermission() {
        System.out.println("Checking permissions");
    }
}
