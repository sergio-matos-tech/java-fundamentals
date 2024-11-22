package entities;

import java.util.Objects;

public class Employee {
    private String ID;
    private String name;
    private float wage;

    public Employee()  {}

    public Employee(String ID, String name, float wage) {
        this.ID = ID;
        this.name = name;
        this.wage = wage;
    }

    public String getID() {
        return ID;
    }

    public float getWage() {
        return wage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void increaseWage(float percentage) {
        this.wage += this.wage * (percentage / 100);
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', id='" + ID + "', wage=$" + wage + "}";
    }
}
