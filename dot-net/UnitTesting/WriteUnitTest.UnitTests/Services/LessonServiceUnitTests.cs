using Microsoft.VisualStudio.TestTools.UnitTesting;
using System;
using WriteUnitTest.Repositories;
using WriteUnitTest.Services;

namespace WriteUnitTest.UnitTests.Services
{
    [TestClass]
    public class LessonServiceUnitTests
    {
        [TestMethod]
        public void UpdateLessonGrade_Failing_Test()
        {
            //Arrange
            var lessonSvc = new LessonService();
            var lessonId = 12;
            var newGrade = 74.0;

            //Act
            lessonSvc.UpdateLessonGrade(lessonId, newGrade);
            
            // Made Repo a property of the LessonService to access the Lesson 
            // Fields in the updated Repo
            var lessonRepo = lessonSvc.LessonRepo;
            var lesson = lessonRepo.GetLesson(12);

            //Assert
            Assert.AreEqual(74.0, lesson.Grade);
            Assert.AreEqual(false, lesson.IsPassed);
        }
        [TestMethod]
        [ExpectedException(typeof(NullReferenceException))]
        public void UpdateLessonGrade_MissingLessonInModule_Test()
        {
            var lessonSvc = new LessonService();
            int lessonId = 46;
            double grade = 86.0;

            lessonSvc.UpdateLessonGrade(lessonId, grade);

            var lessonRepo = lessonSvc.LessonRepo;
            var lesson = lessonRepo.GetLesson(46);

            //throws null reference exception because lesson does not exist in module
            Assert.AreEqual(true, lesson.IsPassed);
        }

        [TestMethod]
        public void UpdateLessonGrade_PassingGrade_Test()
        {
            // added Lesson with Id of 86 to test a lesson with a passing grade
            // without altering the structures themselves
            var lessonSvc = new LessonService();

            int lessonId = 86;
            double grade = 86.0;

            lessonSvc.UpdateLessonGrade(lessonId, grade);

            var lessonRepo = lessonSvc.LessonRepo;
            var lesson = lessonRepo.GetLesson(86);

            Assert.AreEqual(86.0, lesson.Grade);
            Assert.AreEqual(true, lesson.IsPassed);
        }
    }
}