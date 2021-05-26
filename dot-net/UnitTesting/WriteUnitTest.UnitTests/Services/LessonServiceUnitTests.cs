using Microsoft.VisualStudio.TestTools.UnitTesting;
using Moq;
using System;
using System.Collections.Generic;
using WriteUnitTest.Entities;
using WriteUnitTest.Repositories;
using WriteUnitTest.Services;

namespace WriteUnitTest.UnitTests.Services
{
    [TestClass]
    public class LessonServiceUnitTests
    {
        //mocking repository objects/output via Moq library, which creates a true unit testing environment (all outside factors are controlled by the unit test setup)

        [TestMethod]
        [ExpectedException(typeof(NullReferenceException))]
        public void UpdateLessonGrade_NullLessonRepository()
        {
            //arrange
            Mock<IModuleRepository> mockModuleRepo = new Mock<IModuleRepository>();
            mockModuleRepo.Setup(x => x.GetModule(It.IsAny<int>())).Returns(new Module
            {
                ModuleId = 0,
                MinimumPassingGrade = 0,
                Lessons = new List<Lesson>
                {
                    new Lesson
                    {
                        LessonId = 0,
                        Grade = 0.0d,
                        IsPassed = true
                    }
                }
            });

            LessonService lessonService = new LessonService(null, mockModuleRepo.Object);

            //act
            lessonService.UpdateLessonGrade(0, 0.0d);

            //assert - test fails if no NullReferenceException is thrown
        }

        [TestMethod]
        [ExpectedException(typeof(NullReferenceException))]
        public void UpdateLessonGrade_NullModuleRepository()
        {
            //arrange
            Mock<ILessonRepository> mockLessonRepo = new Mock<ILessonRepository>();
            mockLessonRepo.Setup(x => x.GetLesson(It.IsAny<int>())).Returns(new Lesson
            {
                LessonId = 0,
                Grade = 0.0d,
                IsPassed = false
            });

            LessonService lessonService = new LessonService(mockLessonRepo.Object, null);

            //act
            lessonService.UpdateLessonGrade(0, 0.0d);

            //assert - test fails if no NullReferenceException is thrown
        }

        [TestMethod]
        [ExpectedException(typeof(NullReferenceException))]
        public void UpdateLessonGrade_GetLessonReturnsNull()
        {
            //arrange
            Lesson nullLesson = null;
            Mock<ILessonRepository> mockLessonRepo = new Mock<ILessonRepository>();
            mockLessonRepo.Setup(x => x.GetLesson(It.IsAny<int>())).Returns(nullLesson);
            Mock<IModuleRepository> mockModuleRepo = new Mock<IModuleRepository>();
            mockModuleRepo.Setup(x => x.GetModule(It.IsAny<int>())).Returns(new Module
            {
                ModuleId = 0,
                MinimumPassingGrade = 0,
                Lessons = new List<Lesson>
                {
                    new Lesson
                    {
                        LessonId = 0,
                        Grade = 0.0d,
                        IsPassed = true
                    }
                }
            });

            LessonService lessonService = new LessonService(mockLessonRepo.Object, mockModuleRepo.Object);

            //act
            lessonService.UpdateLessonGrade(0, 0.0d);

            //assert - test fails if no NullReferenceException is thrown
        }

        [TestMethod]
        [ExpectedException(typeof(NullReferenceException))]
        public void UpdateLessonGrade_GetModuleReturnsNull()
        {
            //arrange
            Module nullModule = null;
            Mock<ILessonRepository> mockLessonRepo = new Mock<ILessonRepository>();
            mockLessonRepo.Setup(x => x.GetLesson(It.IsAny<int>())).Returns(new Lesson
            {
                LessonId = 0,
                Grade = 0.0d,
                IsPassed = false
            });
            Mock<IModuleRepository> mockModuleRepo = new Mock<IModuleRepository>();
            mockModuleRepo.Setup(x => x.GetModule(It.IsAny<int>())).Returns(nullModule);

            LessonService lessonService = new LessonService(mockLessonRepo.Object, mockModuleRepo.Object);

            //act
            lessonService.UpdateLessonGrade(0, 0.0d);

            //assert - test fails if no NullReferenceException is thrown
        }

        [TestMethod]
        public void UpdateLessonGrade_GetLessonReturnsDefaultObject_ModuleRepositoryIsCalled()
        {
            //arrange
            Mock<ILessonRepository> mockLessonRepo = new Mock<ILessonRepository>();
            mockLessonRepo.Setup(x => x.GetLesson(It.IsAny<int>())).Returns(new Lesson());
            Mock<IModuleRepository> mockModuleRepo = new Mock<IModuleRepository>();
            mockModuleRepo.Setup(x => x.GetModule(It.IsAny<int>())).Returns(new Module
            {
                ModuleId = 0,
                MinimumPassingGrade = 0,
                Lessons = new List<Lesson>
                {
                    new Lesson
                    {
                        LessonId = 0,
                        Grade = 0.0d,
                        IsPassed = true
                    }
                }
            });

            LessonService lessonService = new LessonService(mockLessonRepo.Object, mockModuleRepo.Object);

            //act
            lessonService.UpdateLessonGrade(0, 0.0d);

            //assert
            mockLessonRepo.Verify(x => x.GetLesson(It.IsAny<int>()), Times.Once);
            mockModuleRepo.Verify(x => x.GetModule(It.IsAny<int>()), Times.Once);
        }

        [TestMethod]
        public void UpdateLessonGrade_GetModuleReturnsDefaultObject_ModuleRepositoryIsCalled()
        {
            //arrange
            Mock<ILessonRepository> mockLessonRepo = new Mock<ILessonRepository>();
            mockLessonRepo.Setup(x => x.GetLesson(It.IsAny<int>())).Returns(new Lesson
            {
                LessonId = 0,
                Grade = 0.0d,
                IsPassed = false
            });
            Mock<IModuleRepository> mockModuleRepo = new Mock<IModuleRepository>();
            mockModuleRepo.Setup(x => x.GetModule(It.IsAny<int>())).Returns(new Module());

            LessonService lessonService = new LessonService(mockLessonRepo.Object, mockModuleRepo.Object);

            //act
            lessonService.UpdateLessonGrade(0, 0.0d);

            //assert
            mockLessonRepo.Verify(x => x.GetLesson(It.IsAny<int>()), Times.Once);
            mockModuleRepo.Verify(x => x.GetModule(It.IsAny<int>()), Times.Once);
        }

        [TestMethod]
        public void UpdateLessonGrade_LessonIsPassed_ModuleRepositoryNotCalled()
        {
            //arrange
            Mock<ILessonRepository> mockLessonRepo = new Mock<ILessonRepository>();
            mockLessonRepo.Setup(x => x.GetLesson(It.IsAny<int>())).Returns(new Lesson
            {
                LessonId = 0,
                Grade = 0.0d,
                IsPassed = true
            });
            Mock<IModuleRepository> mockModuleRepo = new Mock<IModuleRepository>();
            mockModuleRepo.Setup(x => x.GetModule(It.IsAny<int>())).Returns(new Module
            {
                ModuleId = 0,
                MinimumPassingGrade = 0,
                Lessons = new List<Lesson>
                {
                    new Lesson
                    {
                        LessonId = 0,
                        Grade = 0.0d,
                        IsPassed = true
                    }
                }
            });

            LessonService lessonService = new LessonService(mockLessonRepo.Object, mockModuleRepo.Object);

            //act
            lessonService.UpdateLessonGrade(0, 0.0d);

            //assert
            mockLessonRepo.Verify(x => x.GetLesson(It.IsAny<int>()), Times.Once);
            mockModuleRepo.Verify(x => x.GetModule(It.IsAny<int>()), Times.Never);
        }

        [TestMethod]
        public void UpdateLessonGrade_LessonIsNotPassed_ModuleRepositoryCalled()
        {
            //arrange
            Mock<ILessonRepository> mockLessonRepo = new Mock<ILessonRepository>();
            mockLessonRepo.Setup(x => x.GetLesson(It.IsAny<int>())).Returns(new Lesson
            {
                LessonId = 0,
                Grade = 0.0d,
                IsPassed = false
            });
            Mock<IModuleRepository> mockModuleRepo = new Mock<IModuleRepository>();
            mockModuleRepo.Setup(x => x.GetModule(It.IsAny<int>())).Returns(new Module
            {
                ModuleId = 0,
                MinimumPassingGrade = 0,
                Lessons = new List<Lesson>
                {
                    new Lesson
                    {
                        LessonId = 0,
                        Grade = 0.0d,
                        IsPassed = true
                    }
                }
            });

            LessonService lessonService = new LessonService(mockLessonRepo.Object, mockModuleRepo.Object);

            //act
            lessonService.UpdateLessonGrade(0, 0.0d);

            //assert
            mockLessonRepo.Verify(x => x.GetLesson(It.IsAny<int>()), Times.Once);
            mockModuleRepo.Verify(x => x.GetModule(It.IsAny<int>()), Times.Once);
        }
    }
}