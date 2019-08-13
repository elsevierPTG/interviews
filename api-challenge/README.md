# Safe Harbor De-Identification

## Introduction

In the United States, the privacy of patient data is governed by the Health
Insurance Portability and Accountability Act, or as it's commonly known, HIPAA.
One regulation falling under HIPAA is the Privacy Rule, which, among other
things, governs what health data can be shared and under what circumstances.
Researchers in health fields often seek out "Limited Data Sets", which have been
stripped of 18 types of data, including biometrics such as fingerprints, birth
dates, telephone numbers, social security numbers, etc.  This process is known
as 'Safe Harbor' de-identification.

For this assessment, we're going to write a real-time de-identification engine,
which is a buzzwordy way of saying we're going to build a simple API which takes
in a single patient record as JSON, and returns a de-identified version.  We're
not going to try to implement all 18, but rather the following rules.

## Problem Statement

Write an API that exposes an endpoint for the de-identification of patient
records. Specifically, we're looking for the following:

* Birthdates should be converted to the patient's age.  If someone is over the age
  of 89, they should be lumped into a 90+ category.

* ZIP Codes should be stripped to the first three digits _except_ where fewer
  than 20,000 people reside in the combination of all ZIP codes with those three
  digits. In this case, the ZIP Code should be set to 00000.  A file with ZIP
  codes and their populations is included in CSV format.  Note that these are
  Zip Code Tabulation Areas (ZCTAs) which exclude certain ZIP codes which are
  not useful for population data (i.e. some office buildings have their own ZIP
  codes due to mail volume, but are not considered for census tabulation).

* Admission and Discharge dates should be set to the year only.

* The notes section should replace anything that looks like an email address,
  US social security number, or a US telephone number with sensible
  replacements.  Any dates in the notes section should be replaced with the
  year.

You may assume that names, pictures, etc. will not occur in the data. You can
assume data is reasonably well formed (i.e. no one will try to pass a date as a
zip code) but the server should ideally not crash if it encounters an edge case.

## Sample Inputs and Outputs

A sample input of:

```
{
    "birthDate": "2000-01-01",
    "zipCode": "10013",
    "admissionDate": "2019-03-12",
    "dischargeDate": "2019-03-14",
    "notes": "Patient with ssn 123-45-6789 previously presented under different ssn"
}
```

Should yield output of:

```
{
    "age": "19",
    "zipCode": "10000",
    "admissionYear": "2019",
    "dischargeYear": "2019",
    "notes": "Patient with ssn XXX-XX-XXXX previously presented under different ssn"
}
```

## Logistics

You may choose any programming language, framework, or technology to complete
this task but should provide instructions (or better yet, a Makefile) for
building and running your API.  Please provide your solution as a ZIP file, or
as a repository from any of the major source control sites, but please keep
repos containing your solution private.  We ask that you not spend much more
than an hour on your solution, as we want to be respectful of your time.  With
that in mind, we'd prefer to see a more well-formed solution that only
handles some of the rules above than one that handles all of them but takes
shortcuts.  Definitely reach out if you have any questions or need any
clarification.
