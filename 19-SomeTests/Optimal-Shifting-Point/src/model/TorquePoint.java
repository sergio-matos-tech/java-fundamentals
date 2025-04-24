package model;

import lombok.Getter;

@Getter
public class TorquePoint {
    private int rpm;
    private double torque;

    public TorquePoint(int rpm, double torque) {
        this.rpm = rpm;
        this.torque = torque;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }

    public void setTorque(double torque) {
        this.torque = torque;
    }
}
