package application;

import entities.Employee;
import entities.OutsorcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int numberOfEmployees = input.nextInt();
        input.nextLine();
        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.printf("Employee #%d data: \n", i + 1);
            System.out.print("Outsourced (y/n)? ");
            char isOutsourced = input.next().toLowerCase().charAt(0);
            input.nextLine();
            System.out.print("Name: ");
            String nameOfEmployee = input.nextLine();
            System.out.print("Hours worked: ");
            Integer hoursWorked = input.nextInt();
            System.out.print("Value per hour: $");
            Double valuePerHour = input.nextDouble();
            if (isOutsourced == 'y') {
                System.out.print("Value of additional charge: $");
                Double additionalCharge = input.nextDouble();
                Employee outsorcedEmployee = new OutsorcedEmployee(nameOfEmployee, hoursWorked, valuePerHour, additionalCharge);
                employees.add(outsorcedEmployee);
            } else {
                Employee employee = new Employee(nameOfEmployee, hoursWorked, valuePerHour);
                employees.add(employee);
            }

            input.nextLine();
        }

        System.out.println("\nPAYMENTS: ");
        for (Employee employee : employees) {
            System.out.printf("[%s]   -   $%.2f\n", employee.getName(), employee.payment());
        }

        input.close();
    }
}