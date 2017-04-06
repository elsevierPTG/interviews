# Java Coding Challenges

This is a set of Java-specific coding challenges designed to vet the technical ability of software engineers applying to Elsevier.

Note that when you submit this assignment, 
you must include your full name, email address, and recruiter name 
so that we can contact you.

Steps:

- Fork this repo
- Modify the code as described in the TODO items inside Exercise1, Exercise2, etc.
- Include javadocs describing why you chose your particular solution
- Send a pull request for your fork when you consider the assignment complete.
- Include a comment in the pull request including your name, email address, and recruiter's name

Additional Notes:

- Don't spend more than 30 minutes on this assignment
- Use comments to describe why you made particular design decisions


## Millar Notes

* Changelog
    * Project Cleanup
        * fixed .gitignore so that gradle wrapper artifacts are retained
        * using newer gradle plugin syntax
        * modified version to comply with [semantic versioning](http://semver.org)
        * Ignored failing tests
        * made code formatting consistent, and added a .editorconfig file to keep things consistent
        * added settings.gradle to avoid creating cruft in the parent directory
    * TDD
        * added infrastructure for testing solutions with [spock](http://docs.spockframework.org)
        * write failing tests (red)
        * make tests pass (green), and refactor as necessary (refactor)

### Project Verification

I wrote tests / specs to validate my implementations.
Run them with:

```
# Using the wrapper
$ ./gradlew check

# Using local gradle installation
$ gradle check
```


### Project and Tests

This project's tests should run consistently across operating systems and platforms.
I usually use jenkins, travis, circle, appveyor, or some similar CI tool to verify interoperability.

Please let me know if there are any issues with tests / verification / project setup.


### Time

It took me a bit more than an hour to complete the exercises.

Most of the time was spent "cleaning up" the project, writing tests, and writing this documentation..
See the git log for more details.


### Contact Info

Applicant: [David W Millar](mailto://david.w.millar@gmail.com)

Recruiter: [Linda Pham (Jobspring Partners)](mailto://linda.pham@jobspringpartners.com)





