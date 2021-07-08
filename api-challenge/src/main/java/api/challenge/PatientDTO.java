package api.challenge;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public interface PatientDTO {

  String getAge();

  void setAge(final String age);

  String getZipCode();

  void setZipCode(final String zipCode);

  String getAdmissionDate();

  void setAdmissionDate(final String admissionDate);

  String getDischargeDate();

  void setDischargeDate(final String dischargeDate);

  String getNotes();

  void setNotes(final String notes);

}

