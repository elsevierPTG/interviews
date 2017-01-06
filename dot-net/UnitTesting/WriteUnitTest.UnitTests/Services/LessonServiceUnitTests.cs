using System.Collections.Generic;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using Moq;
using WriteUnitTest.Entities;
using WriteUnitTest.Interfaces;
using WriteUnitTest.Services;

namespace WriteUnitTest.UnitTests.Services
{
    [TestClass]
    public class LessonServiceUnitTests
    {
        [TestMethod]
        public void UpdateLessonGrade_Test()
        {
            // Use Moq to mock out the repository. In this way we can write several different types of tests by mocking the data we need to set those tests up.
            // For instance we might want to write a test to ensure passing and failing scenarios work correctly
            var mockLessonRepository = new Mock<IRepository<Lesson>>();
            Lesson lesson = new Lesson
            {
                Grade = 89,
                IsPassed = false,
                LessonId = 12
            };
            mockLessonRepository.Setup(mr => mr.GetById(It.IsAny<int>())).Returns(lesson);

            var mockModuleRepository = new Mock<IRepository<Module>>();
            mockModuleRepository.Setup(mr => mr.GetById(It.IsAny<int>())).Returns(new Module
            {
                Lessons = new List<Lesson>
                {
                    lesson
                },
                MinimumPassingGrade = 70,
                ModuleId = 1

            });

            var lessonService = new LessonService(mockLessonRepository.Object, mockModuleRepository.Object);
            Lesson result = lessonService.UpdateLessonGrade(12, 70);

            Assert.IsNotNull(result);
            Assert.AreEqual(result.Grade, 70);
            Assert.IsTrue(result.IsPassed);
        }
    }
}