package org.refact.entities;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TelephoneNumber {
    private String officeAreaCode;
    private String officeNumber;

    public TelephoneNumber() {
    }

    @Builder
    public TelephoneNumber(String officeAreaCode, String officeNumber) {
        this.officeAreaCode = officeAreaCode;
        this.officeNumber = officeNumber;
    }

    public String getTelephoneNumber() {
        return ("(" + officeAreaCode + ") " + officeNumber);
    }
}
