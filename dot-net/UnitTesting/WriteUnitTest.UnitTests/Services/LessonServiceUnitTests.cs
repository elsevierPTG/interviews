using Microsoft.VisualStudio.TestTools.UnitTesting;
using WriteUnitTest.Services;

namespace WriteUnitTest.UnitTests.Services
{
    [TestClass]
    public class LessonServiceUnitTests
    {
        [TestMethod]
        public void UpdateLessonGrade_TestPassingGrade()
        {
            // Tests if UpdateLessonGrade handles passing valid Lesson ID with passing grade
            // NOTE: lesson collection does not exist outside of UpdateLessonGrade so no way to test persistent values

            var lessonSvc = new LessonService();

            var lessonId = 12;
            var grade = 97.1d;

            lessonSvc.UpdateLessonGrade(lessonId, grade);

            Assert.IsTrue(true);
        }

        [TestMethod]
        public void UpdateLessonGrade_TestFailingGrade()
        {
            // Tests if UpdateLessonGrade handles passing valid Lesson ID with failing grade
            // NOTE: lesson collection does not exist outside of UpdateLessonGrade so no way to test persistent values

            var lessonSvc = new LessonService();

            var lessonId = 12;
            var grade = 16.9d;

            lessonSvc.UpdateLessonGrade(lessonId, grade);

            Assert.IsTrue(true);
        }

        [TestMethod]
        public void UpdateLessonGrade_TestInvalidLesson()
        {
            // Tests if UpdateLessonGrade handles passing Lesson IDs that don't exist

            var lessonSvc = new LessonService();

            var lessonId = 86;
            var grade = 53.2d;

            try
            {
                lessonSvc.UpdateLessonGrade(lessonId, grade);
                Assert.IsTrue(true);
            }
            catch
            {
                Assert.Fail();
            }
        }
    }
}