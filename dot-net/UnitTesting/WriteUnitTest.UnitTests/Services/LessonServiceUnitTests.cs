using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace WriteUnitTest.UnitTests.Services
{
    [TestClass]
    public class LessonServiceUnitTests
    {
        [TestMethod]
        public void UpdateLessonGrade_Test()
        {
            var lesson = new Lesson
                {
                    LessonId = 12,
                    Grade = 95.4,
                    IsPassed = true
                };

            var module = new Module
                {
                    ModuleId = 1,
                    MinimumPassingGrade = 93,
                    Lessons = new List<Lesson>
                    {
                        new Lesson
                        {
                            LessonId = 12,
                            Grade = 9.4,
                            IsPassed = false
                        }
                    }
                };
            var mockLessonRepo = new DynamicMock(typeof (ILessonRepository));
            var mockModuleRepo = new DynamicMock(typeof (IModuleRepository));
            mockLessonRepo.ExpectAndReturn("GetLesson", lesson);
            mockModuleRepo.GetModule("GetModule", module);

            var testLessonService = new LessonService();
            var retLesson = testLessonService.UpdateLessonGrade(12, 100);
            Assert.AreEqual(100, retLesson.Grade);
            Assert.AreEqual(true, retLesson.IsPassed);
        }
    }
}