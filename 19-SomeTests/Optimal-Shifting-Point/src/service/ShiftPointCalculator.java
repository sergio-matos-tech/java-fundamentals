package model;

import java.util.List;

public class ShiftPointCalculator {
    private final List<TorquePoint> torqueCurve;
    private final double finalDrive;
    private static final int MIN_RPM = 3000;
    private static final int MAX_RPM = 7500;
    private static final int RPM_STEP = 50;

    public ShiftPointCalculator(List<TorquePoint> torqueCurve, double finalDrive) {
        this.torqueCurve = torqueCurve;
        this.finalDrive = finalDrive;
    }

    /**
     * Finds the optimal RPM to shift gears based on power output after the shift
     * @param gearCurrent Current gear ratio
     * @param gearNext Next gear ratio
     * @return Optimal RPM to shift at
     */
    public int findOptimalShiftRPM(double gearCurrent, double gearNext) {
        int bestRPM = MIN_RPM;
        double bestPowerAfterShift = Double.NEGATIVE_INFINITY;

        // Calculate effective gear ratios considering final drive
        double effectiveGearCurrent = gearCurrent * finalDrive;
        double effectiveGearNext = gearNext * finalDrive;
        double gearRatio = effectiveGearNext / effectiveGearCurrent;

        for (int rpm = MIN_RPM; rpm <= MAX_RPM; rpm += RPM_STEP) {
            int rpmAfterShift = (int) Math.round(rpm * gearRatio);

            // Ensure we don't drop below minimum RPM after shift
            if (rpmAfterShift < MIN_RPM) {
                continue;
            }

            double powerAfterShift = calculatePowerAtRPM(rpmAfterShift);

            if (powerAfterShift > bestPowerAfterShift) {
                bestPowerAfterShift = powerAfterShift;
                bestRPM = rpm;
            }
        }

        return bestRPM;
    }

    /**
     * Calculates power (in arbitrary units) at given RPM
     * @param rpm Engine speed
     * @return Power (torque * rpm)
     */
    private double calculatePowerAtRPM(int rpm) {
        double torque = getTorqueAtRPM(rpm);
        return torque * rpm;
    }

    /**
     * Gets torque value at specified RPM using linear interpolation
     * @param rpm Engine speed
     * @return Torque value
     */
    private double getTorqueAtRPM(int rpm) {
        if (torqueCurve.isEmpty()) {
            return 0;
        }

        // Check if RPM is below first point
        if (rpm <= torqueCurve.get(0).getRpm()) {
            return torqueCurve.get(0).getTorque();
        }

        // Check if RPM is above last point
        if (rpm >= torqueCurve.get(torqueCurve.size() - 1).getRpm()) {
            return torqueCurve.get(torqueCurve.size() - 1).getTorque();
        }

        // Find the interval where the RPM lies
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