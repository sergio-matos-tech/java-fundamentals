package service;


import model.TorquePoint;

import java.util.List;


public class ShiftPointCalculator {
    private final List<TorquePoint> torqueCurve;
    private final double finalDrive;
    private static final int MIN_RPM = 3000;
    private static final int MAX_RPM  = 7500;
    private static final int RPM_STEP = 50;

    public ShiftPointCalculator(List<TorquePoint> torqueCurve, double finalDrive) {
        this.torqueCurve = torqueCurve;
        this.finalDrive = finalDrive;
    }

    public int findOptimalShiftRPM(double gearCurrent, double gearNext) {
        int bestRPM = MIN_RPM;
        double bestPowerAfterShift = Double.NEGATIVE_INFINITY;

        double effectiveGearCurrent = gearCurrent * finalDrive;
        double effectiveGearNext = gearNext * finalDrive;
        double gearRatio = effectiveGearNext / effectiveGearCurrent;

        for (int rpm = MIN_RPM; rpm <= MAX_RPM; rpm += RPM_STEP) {
            int rpmAfterShift = (int) Math.round(rpm * gearRatio);

            if (rpmAfterShift < MIN_RPM)
                continue;

            double powerAfterShift = calculatePowerAtRPM(rpmAfterShift);

            if (powerAfterShift > bestPowerAfterShift) {
                bestPowerAfterShift = powerAfterShift;
                bestRPM = rpm;
            }
        }

        return bestRPM;
    }

    private double calculatePowerAtRPM(int rpm) {
        double torque = getTorqueAtRPM(rpm);
        return torque * rpm;
    }

    private double getTorqueAtRPM(int rpm) {
        if (torqueCurve.isEmpty())
            return 0;

        if (rpm <= torqueCurve.get(0).getRpm())
            return torqueCurve.get(0).getTorque();

        if (rpm >= torqueCurve.get(torqueCurve.size() - 1).getRpm())
            return torqueCurve.get(torqueCurve.size() - 1).getTorque();

        for (int i = 0; i < torqueCurve.size() - 1; i++) {
            TorquePoint lower = torqueCurve.get(i);
            TorquePoint upper = torqueCurve.get(i + 1);

            if (rpm >= lower.getRpm() && rpm <= upper.getRpm()) {
                // Linear interpolation
                double fraction = (double)(rpm - lower.getRpm()) / (upper.getRpm() - lower.getRpm());
                return lower.getTorque() + fraction * (upper.getTorque() - lower.getTorque());
            }
        }

        return 0;
    }
}