# Java Spring Elsevier Interview 

## Description

This will be a very simplistic API meant to simply return and save a set of patients. 
There will also be some business logic needed for some endpoints, so be sure to
read the instructions carefully. Feel free to bring in packages that you feel are necessary. You should also 
prepare to write unit tests for any controllers/services you create. You are free to implement however you see fit,
as long as it meets the requirements. Also, this project uses gradle, but if you are more comfortable with maven, feel free 
to switch.

This exercise should take between 1-3 hours. We are not looking for perfection, just to get a sense
of how you would go about building an API. Once you are done please submit a PR so that the code can be
reviewed. Please add any comments or instructions to the PR if for some reason there is something extra needed
to run or test the application.

## Goals / Instructions

### Patient Model

Create a patient model based on the description below (class already exists with no fields)

> _Anything marked with dID should be able to be de-identified. For example
> a patient with SSN 111-11-1111 should replace all numbers with a *_
> _Anything with a * is a required field_

* id* (uuid)
  * Cannot have 2 ids equal
* firstName* (string)
* lastName* (string - ***dID***)
* dob* (date)
  * Should validate it is a date
* ssn* (string - ***dID***)
  * Should validate format
* phone number (string)
  * Should validate format (###-###-####)

### Endpoints

Create all endpoints listed below, ensuring to follow any of the specific instructions for each endpoint.

> _All endpoints should return proper status codes, which includes any failing states. For example if
> you have a Conflict in a POST it should return a 409. See below for specific instructions on certain
> endpoints_

* ***GET*** _/patients_ - return all patients
* ***GET*** _/patients_ - return all patients with necessary fields de-identified
* ***GET*** _/patients/{id}_ - return specific patient
* ***POST*** _/patients_ - save a given patient
* ***PATCH*** _/patients/{id}_ - save a given patient only passing in the necessary fields
* ***DELETE*** _patients/{id}_ - delete a given patient if they exist

> _For the GET /patient/{id} endpoint it should also return age along with the dob_

> _For the PATCH endpoint the only fields able to be updated are phoneNumber and lastName, no other
> fields should be passed up with the request (other than the id in tha path)_

### Repository

A PatientRepository already exists, it will simply work as an in-memory data store.
All that is needed here is to implement the skeleton methods to return what is necessary.

### Unit Tests

Write whatever unit tests you see fit to implement, any tests that are written should pass

### Running the Application

There is already a dockerfile in place to build and run the application, whatever you produce should be able to run
through this. To build the image run: 

``docker build -t java-spring-api .``

followed by

``docker run -p 8080:8080 java-spring-api``