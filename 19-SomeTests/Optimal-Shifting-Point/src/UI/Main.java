package UI;

import service.ShiftPointCalculator;
import model.TorquePoint;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String carName = "Supra";
        List<TorquePoint> torqueCurve = Arrays.asList(
                new TorquePoint(1000, 20),
                new TorquePoint(2000, 35),
                new TorquePoint(3000, 48),
                new TorquePoint(4000, 55),
                new TorquePoint(5000, 62),
                new TorquePoint(5500, 65), 
                new TorquePoint(6000, 65),
                new TorquePoint(6500, 56),
                new TorquePoint(7000, 51),
                new TorquePoint(7500, 46),
                new TorquePoint(8000, 40)
        );

        double[] gears = {2.276, 1.755, 1.442, 1.210, 1.021, 0.874};
        double finalDrive = 3.500;

        ShiftPointCalculator calculator = new ShiftPointCalculator(torqueCurve, finalDrive);




        System.out.println("Optimal Shift Points for the :" + carName);
        System.out.println("-----------------------------------");

        for (int i = 0; i < gears.length - 1; i++) {
            int shiftRPM = calculator.findOptimalShiftRPM(gears[i], gears[i + 1]);

            System.out.printf("Shift from %d to %d at %d RPM\n",
                    i + 1, i + 2, shiftRPM);
        }


        String fileName = carName.replaceAll("\\s+", "") + "_ShiftPoints.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("Optimal Shift Points for the " + carName);
            writer.newLine();
            writer.write("-----------------------------------");
            writer.newLine();
            writer.newLine();

            for (int i = 0; i < gears.length - 1; i++) {
                int shiftRPM = calculator.findOptimalShiftRPM(gears[i], gears[i + 1]);
                int rpmAfterShift = (int) Math.round(shiftRPM * (gears[i+1]/gears[i]));

                writer.write(String.format("Shift from %d to %d at %d RPM (lands at %d RPM)%n",
                        i + 1, i + 2, shiftRPM, rpmAfterShift));
            }

            System.out.println("Shift points successfully written to " + fileName);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}