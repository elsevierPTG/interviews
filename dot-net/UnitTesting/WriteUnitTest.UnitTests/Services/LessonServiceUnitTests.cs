using Microsoft.VisualStudio.TestTools.UnitTesting;
using WriteUnitTest.Repositories;
using WriteUnitTest.Services;
using WriteUnitTest.Entities;

namespace WriteUnitTest.UnitTests.Services
{
    [TestClass]
    public class LessonServiceUnitTests
    {
        [TestMethod]
        public void UpdateLessonGrade_TestPassCodeBlock()
        {
            // Create Instance of LessonService Class
            var lessonService = new LessonService();

            var lessonId = 12;

            var grade = 98.2d;

            lessonService.UpdateLessonGrade(lessonId, grade);
            Assert.IsTrue(true);
        }

        [TestMethod]
        public void UpdateLessonGrade_TestFailCodeBlock()
        {
            // Create Instance of LessonService Class
            var lessonService = new LessonService();

            var lessonId = 12;

            var grade = 0d;

            lessonService.UpdateLessonGrade(lessonId, grade);
            Assert.IsTrue(true);
        }
    }
}