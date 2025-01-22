package application;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String departmentName = input.nextLine();
        System.out.print("Enter worker data: \n");
        System.out.print("Name: ");
        String workerName = input.nextLine();
        System.out.print("Level: (JUNIOR/MID_LEVEL/SENIOR) ");
        String workerLevel = input.nextLine();
        System.out.printf("Base salary of %s: $", workerName);
        Double baseSalary = input.nextDouble();

        Worker worker = new Worker(workerName, new Department(departmentName), baseSalary, WorkerLevel.valueOf(workerLevel));

        System.out.print("How many contracts to this worker? ");
        int amountOfContracts = input.nextInt();
        input.nextLine();

        for (int i = 0; i < amountOfContracts; i++) {
            System.out.printf("Enter contract #%d data: \n", i + 1);
            System.out.print("Date (dd/MM/yyyy): ");

            String stringDate = input.nextLine();
            LocalDate contractDate = null;
            try {
                contractDate = LocalDate.parse(stringDate, customFormatter);
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date format. Please use (dd/MM/yyyy).");
            }
            System.out.print("Value per hour: $");
            Double valuePerHour = input.nextDouble();
            System.out.print("Duration [hour(s)]: ");
            Integer duration = input.nextInt();
            input.nextLine();

            HourContract contract = new HourContract(contractDate, duration, valuePerHour);
            worker.addContract(contract);
        }

        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = input.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

        input.close();
    }
}
