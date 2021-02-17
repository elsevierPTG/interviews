# SMART on FHIR UI Coding Exercise

## Introduction
The scope of this test is not only technical – it also tries to determine your approach to some of the other challenges we face as software engineers, e.g. dealing with uncertainty, asking for clarification, and agreeing upon scope. The last thing we want to do is take up an unbounded amount of your personal time trying to achieve “perfection” on the tasks outlined in the exercise.
 
With that in mind, consider the requirements in this exercise negotiable. It’s up to you to determine your priorities in completing the tasks outlined below, and how much of your time you think is reasonable to allocate to the exercise as a whole. (This is not a trap!) So, here it goes ...

### Background
SMART on FHIR is a set of protocols designed to provide web applications access to medical data from patient records in a secure, consistent manner. Some basic documentation is available at:
http://docs.smarthealthit.org  
 
(SMART is the security component that allows for an OAuth2-based application launch with a secure context. FHIR defines the structure of various resources (patient demographic data, conditions, observations, allergies, etc.) that allows applications to do interesting things with health data.)
 
## Your challenge
Using the SMART Health IT sandbox at https://r2.smarthealthit.org - create a web application that:
* reads and displays a given patient’s demographic data (name, gender, date of birth)
* displays a sortable table of active conditions that the patient currently has, including
  * condition name
  * date first recorded, if available
  * link to search for this condition on PubMed (URL takes format `https://pubmed.ncbi.nlm.nih.gov/?term=[condition name]` )
 
### Notes:
* The design and implementation of the application is totally up to you - you may use whichever libraries/frameworks you feel appropriate to get the job done, but be prepared to justify your choices. It doesn’t necessarily have to run entirely in the browser, either, if you feel like a server-side component is worthwhile.
* Application should have decent cross-compatibility with modern browsers.
* For this exercise, you don’t need to implement the SMART authorization flow - accessing the open sandbox (which requires no authorization) is enough.
* If you feel like this is going to take you an unreasonable amount of time to complete (more than 2-3 hours maybe), please let the hiring manager with whom you spoke know and we’ll figure out how to de-scope.
* A handy introductory series of FHIR exercises is available at https://github.com/cerner/ignite-learning-lab/wiki/FHIR-Materials.
* The exercise specifies the DTSU2 version of FHIR, but other FHIR versions (including the latest, R4) could be used as well. An R4 server is available at https://r4.smarthealthit.org.
