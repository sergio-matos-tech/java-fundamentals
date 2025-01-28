package ex04;

import java.util.Scanner;

public class Main04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Name: ");
        String name = input.nextLine();
        System.out.println("Gross Salary: $");
        double grossSalary = input.nextDouble();
        System.out.println("Tax: $");
        double tax = input.nextDouble();
        Employee employee1 = new Employee(name, grossSalary, tax);
        System.out.println(employee1);

        System.out.println("What percentage to increase the salary? %");
        double percentageIncrease = input.nextDouble();
        employee1.increaseSalary(percentageIncrease);
        System.out.println("\n** UPDATED ** ");
        System.out.println(employee1);

        input.close();
    }
}
