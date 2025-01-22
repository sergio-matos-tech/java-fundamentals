package entities;

import entities.enums.WorkerLevel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    // associações
    private Department department;
    // Quando há uma composição 'tem muitos', ela não será incluída no contrutor
    private final List<HourContract> contracts = new ArrayList<>();

    public Worker() {
    }

    public Worker(String name, Department department, Double baseSalary, WorkerLevel level) {
        this.name = name;
        this.department = department;
        this.baseSalary = baseSalary;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    public void addContract(HourContract contract) {
        contracts.add(contract);
    }

    public void removeContract(HourContract contract) {
        contracts.remove(contract);
    }

    public Double income(Integer year, Integer month) {
        double sum = baseSalary;
        for (HourContract contract : contracts) {
            LocalDate contractDate = contract.getLocalDate();
            int c_year = contractDate.getYear();
            int c_month = contractDate.getMonthValue(); // Month as 1-based (1 = January, 12 = December)
            if (year.equals(c_year) && month.equals(c_month)) {
                sum += contract.totalValue();
            }
        }
        return sum;
    }
}
