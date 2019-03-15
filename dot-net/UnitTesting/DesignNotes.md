# UnitTests

## Structure changes
- Removing bin/obj and .vs folders that were commited into the repository
- Added gitignore

## Projects dependecies
- Replacing MSTest with xUnit just for convenience. xUnit is being used extensively on .NET Core projects (and comes by default on AWS templates)
- Adding Moq framework
- Adding main project dependency into unit test project
- Creating a couple of mocked data classes to help with positive and negative cases

## Refactor on LessonService
- Constructor with optional dependencies just for the sake of the example (in a real app, I would refrain from this)
- Moving instantiation of repositories to the constructor to: 
    1. Avoid instantiating everytime the method is called
    2. To be able to inject dependecies

## Other refactors
- Adding interfaces to LessonRepository and ModuleRepository
- Adding bool as return for positive and negative cases 
- Managing NullCheck on UpdateLessonGrade when Lesson is not found
- Managing NullCheck on UpdateLessonGrade when Module is not found
