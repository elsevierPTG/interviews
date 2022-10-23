package com.elsevier.javaspringapi.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Pattern;

@Getter
@Setter
@Builder
public final class PatientPatchDto {
    private String lastName;
    @Pattern(regexp = "^\\d{3}-\\d{3}-\\d{4}$", message = "Invalid phone number format. Expected ###-###-####")
    private String phoneNumber;
}
