package com.elsevier.javaspringapi.contract;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;
import java.util.UUID;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PatientDto {

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private UUID id;

    @NotBlank
    private String firstName;

    @NotBlank
    private String lastName;

    @NotNull
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Past(message = "must be past date")
    private LocalDate dob;

    @NotBlank
    @Pattern(regexp = "^(?!000|666)[0-8][0-9]{2}-(?!00)[0-9]{2}-(?!0000)[0-9]{4}$", message = "must be valid and in ###-##-#### format")
    private String ssn;

    @Pattern(regexp = "^\\d{3}-\\d{3}-\\d{4}$", message = "must be in ###-###-#### format")
    private String phoneNumber;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private int age;

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

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
