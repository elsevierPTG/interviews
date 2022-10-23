package com.elsevier.javaspringapi.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;
import java.util.UUID;

import static com.fasterxml.jackson.annotation.JsonProperty.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
@Builder
public final class PatientDto {
    @JsonProperty(access = Access.READ_ONLY)
    private UUID id;

    @NotBlank
    private String firstName;

    @NotBlank
    private String lastName;

    @NotNull
    @Past(message = "DOB cannot be greater or equal to current date")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate dob;

    @NotBlank
    @Pattern(regexp = "^(?!(000|666|9))\\d{3}-(?!00)\\d{2}-(?!0000)\\d{4}$", message = "Invalid SSN format. Expected ###-##-####")
    private String ssn;

    @Pattern(regexp = "^\\d{3}-\\d{3}-\\d{4}$", message = "Invalid phone number format. Expected ###-###-####")
    private String phoneNumber;

    private int age;
}
