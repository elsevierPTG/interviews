package com.elsevier.javaspringapi.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Builder
@Getter
@Setter
public class Patient {
    private UUID id;
    private String firstName;
    private String lastName;
    private LocalDate dob;
    private String ssn;
    private String phoneNumber;

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Patient) {
            return this.getId().equals(((Patient) obj).getId());
        }
        return false;
    }
}
