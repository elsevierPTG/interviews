namespace WriteUnitTest.UnitTests.Services
{
    using Entities;
    using Moq;
    using WriteUnitTest.Repositories;
    using WriteUnitTest.Services;
    using WriteUnitTest.UnitTests.MockData;
    using Xunit;

    public class LessonServiceUnitTests
    {
        private Mock<ILessonRepository> _mockedLessonRepository;
        private Mock<IModuleRepository> _mockedModuleRepository;

        public LessonServiceUnitTests()
        {
            _mockedLessonRepository = new Mock<ILessonRepository>();
            _mockedModuleRepository = new Mock<IModuleRepository>();
        }

        [Fact]
        public void UpdateLessonGrade_LessonIsPassed()
        {
            // Arrange
            var lessonId = 1;
            _mockedLessonRepository.Setup(l => l.GetLesson(lessonId)).Returns(LessonsMockedData.LessonDataIsPassed);
            _mockedModuleRepository.Setup(m => m.GetModule(lessonId)).Returns(new Module());

            var lessonService = new LessonService(_mockedLessonRepository.Object, _mockedModuleRepository.Object);

            // Act
            var result = lessonService.UpdateLessonGrade(lessonId, 80);

            // Assert
            Assert.True(result);
            _mockedLessonRepository.Verify(l => l.GetLesson(lessonId), Times.Once);
            _mockedModuleRepository.Verify(m => m.GetModule(lessonId), Times.Never);
        }

        [Fact]
        public void UpdateLessonGrade_LessonIsNotPassed()
        {
            // Arrange
            var lessonId = 1;
            _mockedLessonRepository.Setup(l => l.GetLesson(lessonId)).Returns(LessonsMockedData.LessonDataIsNotPassed);
            _mockedModuleRepository.Setup(m => m.GetModule(lessonId)).Returns(ModulesMockedData.ModulesData);

            var lessonService = new LessonService(_mockedLessonRepository.Object, _mockedModuleRepository.Object);

            // Act
            var result = lessonService.UpdateLessonGrade(lessonId, 80);

            // Assert
            Assert.True(result);
            _mockedLessonRepository.Verify(l => l.GetLesson(lessonId), Times.Once);
            _mockedModuleRepository.Verify(m => m.GetModule(lessonId), Times.Once);
        }

        [Fact]
        public void UpdateLessonGrade_LessonNotFound()
        {
            // Arrange
            var lessonId = 1;
            _mockedLessonRepository.Setup(l => l.GetLesson(lessonId));
            _mockedModuleRepository.Setup(m => m.GetModule(lessonId)).Returns(ModulesMockedData.ModulesData);

            var lessonService = new LessonService(_mockedLessonRepository.Object, _mockedModuleRepository.Object);

            // Act
            var result = lessonService.UpdateLessonGrade(lessonId, 80);

            // Assert
            Assert.False(result);
            _mockedLessonRepository.Verify(l => l.GetLesson(lessonId), Times.Once);
            _mockedModuleRepository.Verify(m => m.GetModule(lessonId), Times.Never);
        }

        [Fact]
        public void UpdateLessonGrade_ModuleNotFound()
        {
            // Arrange
            var lessonId = 1;
            _mockedLessonRepository.Setup(l => l.GetLesson(lessonId)).Returns(LessonsMockedData.LessonDataIsNotPassed);
            _mockedModuleRepository.Setup(m => m.GetModule(lessonId));

            var lessonService = new LessonService(_mockedLessonRepository.Object, _mockedModuleRepository.Object);

            // Act
            var result = lessonService.UpdateLessonGrade(lessonId, 80);

            // Assert
            Assert.False(result);
            _mockedLessonRepository.Verify(l => l.GetLesson(lessonId), Times.Once);
            _mockedModuleRepository.Verify(m => m.GetModule(lessonId), Times.Once);
        }
    }
}