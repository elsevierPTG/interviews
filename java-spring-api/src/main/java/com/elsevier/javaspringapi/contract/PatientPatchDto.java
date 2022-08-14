package com.elsevier.javaspringapi.contract;

import javax.validation.constraints.Pattern;

public class PatientPatchDto {

    private String lastName;

    @Pattern(regexp = "^\\d{3}-\\d{3}-\\d{4}$", message = "must be in ###-###-#### format")
    private String phoneNumber;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
