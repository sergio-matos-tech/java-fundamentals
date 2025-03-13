package model.entities;

import java.time.LocalDateTime;

public class CarRental {
    private LocalDateTime start;
    private LocalDateTime finish;
    private Vehicle vehicle;
    private Invoice invoice;

    public CarRental() {}

    public CarRental(LocalDateTime start, Vehicle vehicle, LocalDateTime finish) {
        this.start = start;
        this.vehicle = vehicle;
        this.finish = finish;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public LocalDateTime getFinish() {
        return finish;
    }

    public void setFinish(LocalDateTime finish) {
        this.finish = finish;
    }
}
