using Microsoft.VisualStudio.TestTools.UnitTesting;
using WriteUnitTest.Services;

namespace WriteUnitTest.UnitTests.Services
{
    [TestClass]
    public class LessonServiceUnitTests
    {
        [TestMethod]
        public void UpdateLessonGrade_ShouldPassLessonWithPassingGrade()
        {
            // Setup
            LessonService lessonService = new LessonService();
            int lessonId = 12;
            double grade = 100.00d;

            // Act
            lessonService.UpdateLessonGrade(lessonId, grade);

            // Assert
            Assert.AreEqual(lessonService.LessonRepo.GetLesson(lessonId).IsPassed, true, "Passing grade did not pass class");

        }

        [TestMethod]
        public void UpdateLessonGrade_ShouldDoNothingIfLessonAlreadyPassed()
        {
            // Setup
            LessonService lessonService = new LessonService();
            int lessonId = 86;
            double grade = 100.00d;

            // Act
            lessonService.UpdateLessonGrade(lessonId, grade);

            // Assert
            Assert.AreEqual(lessonService.LessonRepo.GetLesson(lessonId).IsPassed, true, "Passing grade did not pass class");
            // This requires another check to verify that the module repository was not called, but I am not yet familiar enough with C#'s syntax for mocks
        }

        [TestMethod]
        public void UpdateLessonGrade_ShouldFailLessonWithFailngGrade()
        {
            // Setup
            LessonService lessonService = new LessonService();
            int lessonId = 12;
            double grade = 0.00d;

            // Act
            lessonService.UpdateLessonGrade(lessonId, grade);

            // Assert
            Assert.AreEqual(lessonService.LessonRepo.GetLesson(lessonId).IsPassed, false, "Failing grade did not fail class");

        }

        [TestMethod]
        public void UpdateLessonGrade_ShouldPassLessonWithGradeEqualToMinimum()
        {
            // Setup
            LessonService lessonService = new LessonService();
            int lessonId = 12;
            double grade = lessonService.ModuleRepository.GetModule(lessonId).MinimumPassingGrade;

            // Act
            lessonService.UpdateLessonGrade(lessonId, grade);

            // Assert
            Assert.AreEqual(lessonService.LessonRepo.GetLesson(lessonId).IsPassed, true, "Equal to passing grade did not pass class");

        }

        [TestMethod]
        public void UpdateLessonGrade_ShouldThrowExceptionWhenInvalidLessonProvided()
        {
            // Setup
            LessonService lessonService = new LessonService();
            int lessonId = 45;
            double grade = 10.0d;

            // Act
            try
            {
                lessonService.UpdateLessonGrade(lessonId, grade);
            }
            catch(System.ArgumentOutOfRangeException e)
            {
                StringAssert.Contains(e.Message, "Lesson id not found!");
                return;
            }

            // Assert
            Assert.Fail("Expected exception not thrown");

        }

        [TestMethod]
        public void UpdateLessonGrade_ShouldThrowExceptionWhenLessonHasNoModule()
        {
            // Setup
            LessonService lessonService = new LessonService();
            int lessonId = 46;
            double grade = 10.0d;

            // Act
            try
            {
                lessonService.UpdateLessonGrade(lessonId, grade);
            }
            catch (System.ArgumentOutOfRangeException e)
            {
                StringAssert.Contains(e.Message, "No module found for lesson!");
                return;
            }

            // Assert
            Assert.Fail("Expected exception not thrown");
        }
    }
}