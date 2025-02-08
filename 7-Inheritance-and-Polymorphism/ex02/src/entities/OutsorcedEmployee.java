package entities;

public class OutsorcedEmployee extends Employee {
    private Double additionalCharge;

    public OutsorcedEmployee() {
        super();
    }

    public OutsorcedEmployee(String name, Integer hoursWorked, Double valuePerHour, Double additionalCharge) {
        super(name, hoursWorked, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override
    public Double payment() {
        return super.payment() + (1.1 * additionalCharge);
    }


}
