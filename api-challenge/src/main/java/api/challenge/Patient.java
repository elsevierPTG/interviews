package api.challenge;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class Patient implements PatientDTO {

  private String birthDate = null;
  private String age = "";
  private String zipCode = null;
  private String admissionDate = null;
  private String dischargeDate = null;
  private String notes = "hello";

  public Patient() {
  }

  public Patient(String birthDate, String zipCode, String admissionDate, String dischargeDate, String notes) {
    this.birthDate = birthDate;
    this.zipCode = zipCode;
    this.admissionDate = admissionDate;
    this.dischargeDate = dischargeDate;
    this.notes = notes;
  }

  public String getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(final String birthDate) {
    this.birthDate = birthDate;
  }

  public String getAge() {
    return age;
  }

  public void setAge(final String age) {
    this.age = age;
  }

  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(final String zipCode) {
    this.zipCode = zipCode;
  }

  public String getAdmissionDate() {
    return admissionDate;
  }

  public void setAdmissionDate(final String admissionDate) {
    this.admissionDate = admissionDate;
  }

  public String getDischargeDate() {
    return dischargeDate;
  }

  public void setDischargeDate(final String dischargeDate) {
    this.dischargeDate = dischargeDate;
  }

  public String getNotes() {
    return notes;
  }

  public void setNotes(final String notes) {
    this.notes = notes;
  }

}

