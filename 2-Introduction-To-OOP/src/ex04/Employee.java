package ex04;

public class Employee {
    private String name;
    private double grossSalary;
    private double tax;

    public Employee(String name, double grossSalary, double tax) {
        this.name = name;
        this.grossSalary = grossSalary;
        this.tax = tax;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrossSalary() {
        return this.grossSalary;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public double getTax() {
        return this.tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double netSalary() {
        return getGrossSalary() - getTax();
    }

    public void increaseSalary(double percentage) {
        setGrossSalary(getGrossSalary() + (getGrossSalary() * (percentage / 100)));
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", grossSalary=$" + grossSalary +
                ", tax=$" + tax +
                ", net salary = $" + netSalary() +
                '}';
    }
}
