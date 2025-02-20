package models.entities;

import models.exceptions.DomainException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Reservation {
    private Integer roomNumber;
    private LocalDate checkin;
    private LocalDate checkout;

    public Reservation() {}

    public Reservation(Integer roomNumber, LocalDate checkin, LocalDate checkout) throws DomainException {
        LocalDate dateNow = LocalDate.now();
        if (checkin.isBefore(checkout) && checkin.isAfter(dateNow) || checkin.isEqual(dateNow)) {
            this.checkin = checkin;
            this.checkout = checkout;
            this.roomNumber = roomNumber;
        } else {
            throw new DomainException("ERROR: Reservation dates must be of today or future dates!");
        }
    }
    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public LocalDate getCheckout() {
        return checkout;
    }

    public void setCheckout(LocalDate checkout) {
        this.checkout = checkout;
    }

    public LocalDate getCheckin() {
        return checkin;
    }

    public void setCheckin(LocalDate checkin) {
        this.checkin = checkin;
    }

    public Long duration() {
        return ChronoUnit.DAYS.between(checkin, checkout);
    }

    public void updateDates(LocalDate checkin, LocalDate checkout) throws DomainException {
        LocalDate dateNow = LocalDate.now();
        if (checkin.isBefore(checkout) && checkin.isAfter(dateNow) || checkin.isEqual(dateNow)) {
            this.checkin = checkin;
            this.checkout = checkout;
        } else {
            throw new DomainException("ERROR: Reservation dates must be of today or future dates!");
        }
    }

    @Override
    public String toString() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return String.format("\nReservation: Room %d\ncheck-in date: %s\ncheck-out date: %s\nNights: %d",
                roomNumber, checkin.format(dateTimeFormatter), checkout.format(dateTimeFormatter), duration());
    }
}
