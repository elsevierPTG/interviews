using FizzWare.NBuilder;
using Moq;
using NUnit.Framework;
using WriteUnitTest.Entities;
using WriteUnitTest.Interfaces;
using WriteUnitTest.Services;

namespace WriteUnitTest.UnitTests.Services
{
    [TestFixture]
    public class LessonServiceUnitTests
    {
        [Test]
        public void UpdateLessonGrade_LessonReturnedIsPassed_ShouldSetLessonIsPassedToTrue()
        {
            //Arrange
            var mockLessonRepository = new Mock<ILessonRepository>();
            var mockModuleRepository = new Mock<IModuleRepository>();
            var service = new LessonService(mockLessonRepository.Object, mockModuleRepository.Object);
            //var testLesson = Builder<Lesson>.CreateNew().Build();
            Lesson testLesson = new Lesson {
                LessonId = 1,
                Grade = 70.5,
                IsPassed = true
            };
            mockLessonRepository.Setup(q => q.GetLesson(It.IsAny<int>())).Returns(testLesson);

            //Act
            var lesson = service.UpdateLessonGrade(testLesson.LessonId, 80.5);

            //Assert
            NUnit.Framework.Assert.That(lesson, Is.Not.Null);
            Assert.That(lesson.IsPassed, Is.True);
            mockLessonRepository.Verify(x => x.GetLesson(It.Is<int>(q=>q==testLesson.LessonId)), Times.Once, "Missing mandatory call to lesson repository to get lesson.");
            mockModuleRepository.Verify(x => x.GetModule(It.IsAny<int>()), Times.Never, "Invalid call made to module repository to get module.");
        }

        [Test]
        public void UpdateLessonGrade_LessonReturnedIsFailed_ShouldSetLessonIsPassedToFalse()
        {
            //Arrange
            var mockLessonRepository = new Mock<ILessonRepository>();
            var mockModuleRepository = new Mock<IModuleRepository>();
            var service = new LessonService(mockLessonRepository.Object, mockModuleRepository.Object);
            //var testLesson = Builder<Lesson>.CreateNew().Build();
            Lesson testLesson = new Lesson
            {
                LessonId = 1,
                Grade = 70.5,
                IsPassed = false
            };
            mockLessonRepository.Setup(q => q.GetLesson(It.IsAny<int>())).Returns(testLesson);
            Module testModule = new Module
            {
                MinimumPassingGrade = 75
            };
            mockModuleRepository.Setup(q => q.GetModule(It.IsAny<int>())).Returns(testModule);

            //Act
            var lesson = service.UpdateLessonGrade(testLesson.LessonId, 74);

            //Assert
            NUnit.Framework.Assert.That(lesson, Is.Not.Null);
            Assert.That(lesson.IsPassed, Is.False);
            mockLessonRepository.Verify(x => x.GetLesson(It.Is<int>(q => q == testLesson.LessonId)), Times.Once, "Missing mandatory call to lesson repository to get lesson.");
            mockModuleRepository.Verify(x => x.GetModule(It.IsAny<int>()), Times.Once, "Missing mandatory call to module repository to get module.");
        }

        [Test]
        public void UpdateLessonGrade_LessonReturnedIsFailed_ShouldSetLessonIsPassedToTrue()
        {
            //Arrange
            var mockLessonRepository = new Mock<ILessonRepository>();
            var mockModuleRepository = new Mock<IModuleRepository>();
            var service = new LessonService(mockLessonRepository.Object, mockModuleRepository.Object);
            //var testLesson = Builder<Lesson>.CreateNew().Build();
            Lesson testLesson = new Lesson
            {
                LessonId = 1,
                Grade = 70.5,
                IsPassed = false
            };
            mockLessonRepository.Setup(q => q.GetLesson(It.IsAny<int>())).Returns(testLesson);
            Module testModule = new Module
            {
                MinimumPassingGrade = 70
            };
            mockModuleRepository.Setup(q => q.GetModule(It.IsAny<int>())).Returns(testModule);

            //Act
            var lesson = service.UpdateLessonGrade(testLesson.LessonId, 74);

            //Assert
            NUnit.Framework.Assert.That(lesson, Is.Not.Null);
            Assert.That(lesson.IsPassed, Is.True);
            mockLessonRepository.Verify(x => x.GetLesson(It.Is<int>(q => q == testLesson.LessonId)), Times.Once, "Missing mandatory call to lesson repository to get lesson.");
            mockModuleRepository.Verify(x => x.GetModule(It.IsAny<int>()), Times.Once, "Missing mandatory call to module repository to get module.");
        }
    }
}