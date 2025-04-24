package model;

public class TorquePoint {
    private int rpm;
    private double torque;

    public TorquePoint(int rpm, double torque) {
        this.rpm = rpm;
        this.torque = torque;
    }

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }

    public double getTorque() {
        return torque;
    }

    public void setTorque(double torque) {
        this.torque = torque;
    }
}
