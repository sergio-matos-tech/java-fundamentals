import entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        String path = "/home/alfaneto/Documents/Java-Completo/10-Interfaces/ex06/employees.csv";

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {

            String employeeCSV = reader.readLine();
            while (employeeCSV != null) {
                String[] fields = employeeCSV.split(",");
                employees.add(new Employee(fields[0], Double.parseDouble(fields[1])));
                employeeCSV = reader.readLine();
            }
            Collections.sort(employees);
            System.out.println("Sorted by $");
            for (Employee emp : employees) {
                System.out.println(emp.getName() + ", $" + emp.getSalary());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}