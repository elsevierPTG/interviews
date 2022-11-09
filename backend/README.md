# Book Match Project

## Problem Statement
You work for a large publishing company.  You have been given a list of books and have been asked 
to determine if these books exist in the book database. The book database with all the book titles
is available for you to query, however the book titles may not match exactly.  The goal of this 
project is to write a service that compares book titles from a client application to book titles 
stored in a database and returns true of false if titles match.  
The following rules apply to matching book titles:

	- Capitalization should be ignored
	- Punctuation and whitespace should be ignored
	- These noise words should be ignored:
 		* the
 		* in
 		* of
 		* and
 		
### Examples:
 * `ABELOFF'S CLINICAL ONCOLOGY		should match to		Abeloffs Clinical Oncology`
 * `Atlas of Clinical Neurology		should match to 	The Atlas Clinical   Neurology`

### Rules:
 You can make any changes to any part of the project as you see fit.  You may add any class, test, or
 package you want.  However, the import.sql file represents the current state of the database and may 
 not be changed. All the books to match are in the BooksToMatch enum.  You cannot add or remove books
 from this enumeration.
 
 The code should be unit tested.  It is not necessary to write tests for the existing code.  
   
### Result:   
To complete this project you should get the following output when running BookMatchClient:

 `Shoulder Arthroplasty: Exists ->true`
 
 `Good Night Moon: Exists ->false`
 
 `AIDS Therapy: Exists ->true`
 
 `Andrews' Diseases of the Skin: Clinical Dermatology: Exists ->true`
 
##### HINT
 You can use the @Transactional annotation on any method to start a hibernate session
