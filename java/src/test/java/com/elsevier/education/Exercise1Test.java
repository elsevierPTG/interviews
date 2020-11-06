package com.elsevier.education;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertNotEquals;

public class Exercise1Test {

  @Test
  public void checkCannotAddPhoneNumbersToExternalRef() {
    Set<String> phoneNumbers = new HashSet<>();
    phoneNumbers.add("555-1212");
    Exercise1.Person person = new Exercise1.Person("John", "Smith", phoneNumbers);

    phoneNumbers.add("867-5309");

    assertNotEquals(phoneNumbers.size(), person.getPhoneNumbers().size());
  }

  @Test(expected = UnsupportedOperationException.class)
  public void checkCannotAddPhoneNumbersToInternalRef() {
    Set<String> phoneNumbers = new HashSet<>();
    phoneNumbers.add("555-1212");
    Exercise1.Person person = new Exercise1.Person("John", "Smith", phoneNumbers);

    person.getPhoneNumbers().add("111-2222");
  }


}
