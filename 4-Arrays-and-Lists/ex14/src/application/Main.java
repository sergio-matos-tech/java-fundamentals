package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();

        System.out.print("How many employees would you like to add? ");
        int amountOfEmployees = input.nextInt();
        input.nextLine();

        for (int i = 0; i < amountOfEmployees; i++) {
            System.out.printf("%d EMPLOYEE: ", i + 1);
            System.out.print("Name: ");
            String name = input.nextLine();
            System.out.print("Wage: $");
            float wage = input.nextFloat();
            input.nextLine();

            boolean validID = false;
            do {
                System.out.print("ID (8-digit): ");
                final String ID = input.nextLine();

                if (ID.length() == 8) {
                    boolean existsID = employees.stream()
                            .anyMatch(employee -> employee.getID().equals(ID));
                    if (existsID) {
                        System.out.println("The ID " + ID + " already exists in the list. Try again!");
                    } else {
                        validID = true;
                        Employee newEmployee = new Employee(ID, name, wage);
                        employees.add(newEmployee);
                    }
                } else {
                    System.out.println("The ID must be exactly 8 digits. Try again!");
                }

            } while (!validID);

            System.out.println("Employee added successfully!\n");
        }

        boolean found;
        float percentage;

        do {
            System.out.print("Enter the ID that will have the wage increased: ");
            final String currentIDToIncreaseWage = input.next();

            found = employees.stream()
                    .anyMatch(employee -> employee.getID().equals(currentIDToIncreaseWage));

            if (!found) {
                System.out.println("ID not found. Please enter a valid employee ID.");
            } else {
                System.out.print("Enter the percentage: %");
                percentage = input.nextFloat();
                Employee employeeToUpdate = employees.stream()
                        .filter(employee -> employee.getID().equals(currentIDToIncreaseWage))
                        .findFirst()
                        .orElseThrow(() -> new IllegalArgumentException("Employee not found"));
                employeeToUpdate.increaseWage(percentage);
                input.nextLine();
            }
        } while (!found);

        System.out.println("\nEmployees List:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        input.close();
    }
}