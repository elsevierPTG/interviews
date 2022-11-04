package com.elsevier.education;

import org.junit.Test;

import java.util.Collections;
import java.util.Set;

import static org.junit.Assert.*;

public class Exercise1Test {

    @Test
    public void happypath() {
        ImmutablePerson person = ImmutablePerson.builder()
                .firstName("Karl")
                .lastName("Pietrzak")
                .addPhoneNumbers("585-709-9290")
                .build();
    }

    @Test
    public void does_not_allow_nulls() {
        try {
            ImmutablePerson person = ImmutablePerson.builder()
                    .firstName(null)
                    .lastName("Pietrzak")
                    .addPhoneNumbers("585-709-9290")
                    .build();
            fail("Should not have gotten here");
        }catch(Exception e) {

        }
    }

    @Test
    public void test_plain_person() {
        Set<String> phoneNumbers = Collections.singleton("555");
        Exercise1.PlainPerson person = new Exercise1.PlainPerson("karl", "pietrzak", phoneNumbers);
        try{
            phoneNumbers.add("666");
            fail("should not be able to add a phone number");
        } catch(UnsupportedOperationException e) {

        }
    }
}