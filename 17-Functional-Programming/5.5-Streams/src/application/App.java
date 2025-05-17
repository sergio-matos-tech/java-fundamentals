package application;

import entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) {

        String path = "C:\\Users\\sergi\\Documents" +
                "\\Java-Completo\\17-Functional-Programming\\5.5-Streams\\employees.csv";

        List<Employee> employees = new ArrayList<Employee>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                String[] data = line.split(",");
                String id = data[0];
                String name = data[1];
                String email = data[2];
                double salary = Double.parseDouble(data[3]);
                employees.add(new Employee(id, name, email, salary));
                line = br.readLine();
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }



        List<String> emailsEmployeesSalaryGreaterThan6000 = employees.stream()
                .filter(employee -> employee.getSalary() > 60000)
                .map(Employee::getEmail)
                .sorted()
                .toList();


        employees.forEach(System.out::println);
        System.out.println();
        System.out.println(emailsEmployeesSalaryGreaterThan6000);

        double sumSalaryEmployeesWithFirstLetterOfTheNameIsJ=
                employees.stream()
                        .filter(employee -> employee.getName().startsWith("J"))
                        .map(Employee::getSalary)
                        .reduce(0.0, Double::sum);

        System.out.println();
        System.out.printf("Sum Salary R$ %.2f\n", sumSalaryEmployeesWithFirstLetterOfTheNameIsJ);


    }
}
