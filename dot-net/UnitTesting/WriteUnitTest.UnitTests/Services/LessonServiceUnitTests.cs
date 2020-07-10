using Microsoft.VisualStudio.TestTools.UnitTesting;
using WriteUnitTest.Services;

namespace WriteUnitTest.UnitTests.Services
{
    [TestClass]
    public class LessonServiceUnitTests
    {

        /// <summary>
        /// Since i have had been asked to write only one unit tests so
        /// i am commenting out the xample asserts which could also
        /// be tested after refactor but in different tests IMHO.
        /// </summary>
        [TestMethod]
        public void UpdateLessonGrade_Test()
        {
            LessonService lessonService = new LessonService();
            bool passes = false;
            //Assert.IsTrue(lessonService.UpdateLessonGrade(12,23.4,out passes) == "Success" && !passes);
            //Assert.IsTrue(lessonService.UpdateLessonGrade(1, 23.4, out passes) == "Lesson not Found!" && !passes);
            Assert.IsTrue(lessonService.UpdateLessonGrade(12, 98.4, out passes) == "Success" && passes);

        }
    }
}