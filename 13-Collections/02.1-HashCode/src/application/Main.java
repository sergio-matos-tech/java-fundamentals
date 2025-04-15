package application;

import entities.Client;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("Maria Carla", "mariacarla@gmail.com", "70004104122");
        Client client2 = new Client("Maria Carla", "mariacarlinha@gmail.com", "55122298843");
        System.out.println(client1.hashCode());
        System.out.println(client2.hashCode());

        System.out.println(client1.equals(client2));
    }
}