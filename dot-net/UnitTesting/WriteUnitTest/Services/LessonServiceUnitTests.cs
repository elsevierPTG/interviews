using Microsoft.VisualStudio.TestTools.UnitTesting;
using WriteUnitTest.Services;
using WriteUnitTest.Repositories;

namespace WriteUnitTest.UnitTests.Services
{
    [TestClass]
    public class LessonServiceUnitTests
    {
        /// <summary>
        /// This will test if updating a lesson to a passing grade will work correctly
        /// </summary>
        [TestMethod]
        public void UpdateLessonGrade_Test()
        {
            // set up test vars
            int testLessonId = 12;
            double testGrade = 90.2d;
            bool expectedIsPassed = true; // a grade of 90.2 is passing for lesson 12

            // perform the update on the lesson
            var lessonSvc = new LessonService();
            lessonSvc.UpdateLessonGrade(testLessonId, testGrade);

            // get the updated lesson
            var lesson = lessonSvc.lessonRepo.GetLesson(testLessonId);

            // test if it worked by comparing the expected 
            Assert.AreEqual(expectedIsPassed, lesson.IsPassed);
        }
    }
}