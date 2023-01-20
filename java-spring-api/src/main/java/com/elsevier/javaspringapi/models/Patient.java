package com.elsevier.javaspringapi.models;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import java.util.Date;
import java.util.UUID;

// TODO: implement this model

public class Patient {

    //id* (uuid) Cannot have 2 ids equal
    @NotNull(message = "id shouldn't be null")
    private UUID id;

    //firstName* (string)
    @NotBlank(message = "firstName shouldn't be null or empty")
    private String firstName;

    //lastName* (string - dID)
    @NotBlank(message = "lastName shouldn't be null or empty")
    private String lastName;
    @NotNull(message = "DOB shouldn't be null")
    @Past(message = "The date of birth must be in the past.")
    private Date dob;

    @NotBlank(message = "SSN shouldn't be null or empty")
    private String ssn;

    @Pattern(regexp = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$", message = "Enter a valid phone number")
    private String phoneNumber;

    public Patient() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Patient(UUID id, String firstName, String lastName, Date dob, String ssn, String phoneNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.ssn = ssn;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob=" + dob +
                ", ssn='" + ssn + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
