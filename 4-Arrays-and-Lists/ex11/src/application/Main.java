package application;

import entities.Rent;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        // all the rooms are vacant
        Rent[] rents = new Rent[10];

        System.out.print("How many students to be placed: ");
        int amountOfStudents = input.nextInt();
        input.nextLine();

        for (int i = 0; i < amountOfStudents; i++) {

            System.out.printf("Rent #%d: \n", i + 1);
            System.out.print("Name: ");
            String name = input.nextLine();
            System.out.print("Email: ");
            String email = input.nextLine();

            System.out.println("Vacant Rooms: ");
            for (int j = 0; j < rents.length; j++) {
                if (rents[j] == null) {
                    System.out.printf("%d ", j);
                }
            }
            System.out.println();
            int roomNumber;
            do {
                System.out.print("Room Number: ");
                roomNumber = input.nextInt();
                input.nextLine();

                if (roomNumber < 0 || roomNumber >= rents.length) {
                    System.out.println("Invalid room number. Room must be between 0 and " + (rents.length - 1) + ".");
                } else if (rents[roomNumber] != null) {
                    System.out.println("Room " + roomNumber + " is already occupied. Please choose another.");
                }

            } while (roomNumber < 0 || roomNumber >= rents.length || rents[roomNumber] !=  null);

            rents[roomNumber] = new Rent(name, email, roomNumber);

        }

        System.out.println("\nOccupied Rooms:");
        for (int i = 0; i < rents.length; i++) {
            if (rents[i] != null) {
                System.out.println("Room " + i + ": " + rents[i].getName() + ", " + rents[i].getEmail());
            }
        }

        input.close();
    }
}