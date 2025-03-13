package application;

import entities.DataBaseLoader;
import entities.FileLoader;

public class Main {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();

        dataBaseLoader.load();
        fileLoader.load();
    }
}