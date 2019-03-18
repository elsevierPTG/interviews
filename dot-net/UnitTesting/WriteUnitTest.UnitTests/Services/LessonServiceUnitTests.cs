namespace WriteUnitTest.UnitTests.Services
{
    using Entities;
    using Microsoft.VisualStudio.TestTools.UnitTesting;
    using NSubstitute;
    using Repositories;
    using WriteUnitTest.Services;

    [TestClass]
    public class LessonServiceUnitTests
    {
        private ILessonRepository lessonRepository;
        private IModuleRepository moduleRepository;
        private LessonService sut;

        [TestInitialize]
        public void Initialize()
        {
            lessonRepository = Substitute.For<ILessonRepository>();
            moduleRepository = Substitute.For<IModuleRepository>();
            sut = new LessonService(lessonRepository, moduleRepository);
        }

        [TestMethod]
        public void UpdateLessonGrade_WhenGetLessonReturnsNull_ReturnNull()
        {
            const int lessonId = 12;
            lessonRepository.GetLesson(lessonId).Returns((Lesson)null);

            var result = sut.UpdateLesson(lessonId, 0d);

            Assert.IsNull(result);
        }

        [TestMethod]
        public void UpdateLessonGrade_WhenLessonIsPassed_ReturnUnmodifiedLesson()
        {
            const int lessonId = 12;
            var lesson = new Lesson
            {
                LessonId = lessonId,
                Grade = 80d,
                IsPassed = true,
            };
            lessonRepository.GetLesson(lessonId).Returns(lesson);

            var result = sut.UpdateLesson(lessonId, 0d);

            Assert.AreEqual(lesson.LessonId, result.LessonId);
            Assert.AreEqual(lesson.Grade, result.Grade);
            Assert.AreEqual(lesson.IsPassed, result.IsPassed);
        }

        [TestMethod]
        public void UpdateLessonGrade_WhenLessonFailedAndGetModuleReturnsNull_ReturnUpdatedLesson()
        {
            const double grade = 70d;
            const int lessonId = 12;
            var lesson = new Lesson
            {
                LessonId = lessonId,
                Grade = 80d,
                IsPassed = false,
            };
            lessonRepository.GetLesson(lessonId).Returns(lesson);
            moduleRepository.GetModule(lessonId).Returns((Module)null);

            var result = sut.UpdateLesson(lessonId, grade);

            Assert.AreEqual(lesson.LessonId, result.LessonId);
            Assert.AreEqual(grade, result.Grade);
            Assert.AreEqual(lesson.IsPassed, result.IsPassed);
        }

        [TestMethod]
        public void UpdateLessonGrade_WhenLessonFailedAndFailingGrade_ReturnUpdatedLesson()
        {
            const double grade = 70d;
            const int lessonId = 12;
            var lesson = new Lesson
            {
                LessonId = lessonId,
                Grade = 80d,
                IsPassed = false,
            };
            lessonRepository.GetLesson(lessonId).Returns(lesson);
            var module = new Module { MinimumPassingGrade = 90 };
            moduleRepository.GetModule(lessonId).Returns(module);

            var result = sut.UpdateLesson(lessonId, grade);

            Assert.AreEqual(lesson.LessonId, result.LessonId);
            Assert.AreEqual(grade, result.Grade);
            Assert.IsFalse(result.IsPassed);
        }

        [TestMethod]
        public void UpdateLessonGrade_WhenLessonFailedAndPassingGrade_ReturnUpdatedLesson()
        {
            const double grade = 70d;
            const int lessonId = 12;
            var lesson = new Lesson
            {
                LessonId = lessonId,
                Grade = 80d,
                IsPassed = false,
            };
            lessonRepository.GetLesson(lessonId).Returns(lesson);
            var module = new Module { MinimumPassingGrade = 70 };
            moduleRepository.GetModule(lessonId).Returns(module);

            var result = sut.UpdateLesson(lessonId, grade);

            Assert.AreEqual(lesson.LessonId, result.LessonId);
            Assert.AreEqual(grade, result.Grade);
            Assert.IsTrue(result.IsPassed);
        }
    }
}
