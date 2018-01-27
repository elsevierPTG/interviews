using Microsoft.VisualStudio.TestTools.UnitTesting;
using WriteUnitTest.Services;
using WriteUnitTest.Common;

namespace WriteUnitTest.UnitTests.Services
{
    // Here's a summary of my changes to the solution:
    //
    // Added ServiceResponse class to encapsulate information returned from a call to the LessonService.
    //
    // Added an enum to hold response codes set in a ServiceResponse object.
    //
    // Refactored LessonService to better separate concerns and to add more defensive coding techniques.
    //
    // Added four unit tests to test 100% of LessonService.UpdateLessonGrade, except for the exception block,
    // which cannot be unit tested given the current makeup of the code.

    [TestClass]
    public class LessonServiceUnitTests
    {
        private LessonService _service = new LessonService();

        [TestMethod]
        public void UpdateLessonGrade_Test_InvalidGrade()
        {
            var response = _service.UpdateLessonGrade(TestItems.ValidLessonId, TestItems.InvalidGrade);

            Assert.IsNotNull(response);
            Assert.IsFalse(response.Success);
            Assert.IsTrue(response.ResponseCode == Enums.LessonServiceCodes.InvalidGrade);
        }

        [TestMethod]
        public void UpdateLessonGrade_Test_InvalidLessonId()
        {
            var response = _service.UpdateLessonGrade(TestItems.InvalidLessonId, TestItems.ValidGrade);

            Assert.IsNotNull(response);
            Assert.IsFalse(response.Success);
            Assert.IsTrue(response.ResponseCode == Enums.LessonServiceCodes.InvalidLessonId);
        }

        [TestMethod]
        public void UpdateLessonGrade_Test_InvalidLessonIdForModule()
        {
            var response = _service.UpdateLessonGrade(TestItems.InvalidLessonIdForModule, TestItems.ValidGrade);

            Assert.IsNotNull(response);
            Assert.IsFalse(response.Success);
            Assert.IsTrue(response.ResponseCode == Enums.LessonServiceCodes.InvalidLessonIdForModule);
        }

        [TestMethod]
        public void UpdateLessonGrade_Test_ValidLessonAndGrade()
        {
            // Note that if we were actually persisting an update and we wanted to test that
            // data was persisted correctly, then it would be appropriate to call another
            // service method to return the given lesson to verify the grade was changed.

            var response = _service.UpdateLessonGrade(TestItems.ValidLessonId, TestItems.ValidGrade);

            Assert.IsNotNull(response);
            Assert.IsTrue(response.Success);
            Assert.IsTrue(response.ResponseCode == Enums.LessonServiceCodes.UpdateSuccess);
        }

        /// <summary>
        /// Convenience class to hold various valid and invalid Ids, etc.
        /// This sort of thing could normally be pulled from a config file
        /// or some config repository, etc.
        /// </summary>
        private static class TestItems
        {
            public static double InvalidGrade => -7;

            public static double ValidGrade => 50;

            public static int InvalidLessonId => 15;

            public static int ValidLessonId => 12;

            public static int InvalidLessonIdForModule => 46;
        }
    }
}