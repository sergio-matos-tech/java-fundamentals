package entities;

public class DataBaseLoader implements DataLoader, DataRemover {

    @Override
    public void load() {
        System.out.println("Loading data from the data base");
    }

    @Override
    public void remove() {
        System.out.println("Removing data from the database");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checking permissions on the database");
    }
}
