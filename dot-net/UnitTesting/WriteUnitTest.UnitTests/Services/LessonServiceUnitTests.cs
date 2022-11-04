using Microsoft.VisualStudio.TestTools.UnitTesting;
using Moq;
using WriteUnitTest.Entities;
using WriteUnitTest.Interfaces;
using WriteUnitTest.Repositories;
using WriteUnitTest.Services;

namespace WriteUnitTest.UnitTests.Services
{
    [TestClass]
    public class LessonServiceUnitTests
    {
        [TestMethod]
        public void UpdateLessonGrade_IsPassingGrade()
        {
            //Arrange
            var lessonId = 12;

            var lesson = new Lesson() { LessonId = lessonId };
            var module = new Module() { ModuleId = lessonId, MinimumPassingGrade = 80 };

            var lessonRepositoryMock = new Mock<ILessonRepository>();
            lessonRepositoryMock.Setup(x => x.GetLesson(lessonId)).Returns(lesson);

            var moduleRepositoryMock = new Mock<IModuleRepository>();
            moduleRepositoryMock.Setup(x => x.GetModule(lessonId)).Returns(module);

            var lessonService = new LessonService(lessonRepositoryMock.Object, moduleRepositoryMock.Object);

            //Act
            lessonService.UpdateLessonGrade(12, 98.2d);

            //Assert
            Assert.IsTrue(lesson.IsPassed); // assuming it should pass in this condition
            Assert.AreEqual(98.2d, lesson.Grade); // expected Lesson Grade should be what you expected the grade to be after you call UpdateLessonGrade
        }
    }
}