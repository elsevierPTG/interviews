using FakeItEasy;
using System;
using WriteUnitTest.Entities;
using WriteUnitTest.Repositories;
using WriteUnitTest.Exceptions;
using WriteUnitTest.Services;
using Xunit;
using System.Collections.Generic;

namespace WriteUnitTest.UnitTests.Services
{
    public class LessonServiceUnitTests
    {
        public class UpdateLessonGradeTests
        {
            [Fact]
            public void ThrowsNotFoundException_IfLessonDoesNotExist()
            {
                // Arrange
                var lessonRepository = A.Fake<ILessonRepository>();
                var moduleRepository = A.Fake<IModuleRepository>();

                A.CallTo(() => lessonRepository.GetLesson(A<int>.Ignored)).Returns(null);

                var lessonService = new LessonService(lessonRepository, moduleRepository);
                
                // Act, Assert
                Assert.Throws<NotFoundException>(() => lessonService.UpdateLessonGrade(LessonId, Grade));
            }

            [Fact]
            public void ThrowsException_IfLessonIsNotInModule()
            {
                // Arrange
                var lessonRepository = A.Fake<ILessonRepository>();
                var moduleRepository = A.Fake<IModuleRepository>();

                A.CallTo(() => moduleRepository.GetModule(A<int>.Ignored)).Returns(null);

                var lessonService = new LessonService(lessonRepository, moduleRepository);
                
                // Act, Assert
                Assert.Throws<NotFoundException>(() => lessonService.UpdateLessonGrade(LessonId, Grade));
            }

            [Fact]
            public void IfLessonIsNotInModule_GradeChanges()
            {
                // Arrange
                var lessonRepository = A.Fake<ILessonRepository>();
                var moduleRepository = A.Fake<IModuleRepository>();

                var lesson = new Lesson { Grade = 0, IsPassed = false, LessonId = LessonId };
                A.CallTo(() => lessonRepository.GetLesson(A<int>.Ignored)).Returns(lesson);
                A.CallTo(() => moduleRepository.GetModule(A<int>.Ignored)).Returns(null);

                var lessonService = new LessonService(lessonRepository, moduleRepository);
                
                // Act
                Assert.Throws<NotFoundException>(() => lessonService.UpdateLessonGrade(LessonId, Grade));

                // Assert
                Assert.Equal(Grade, lesson.Grade);
            }

            [Fact]
            public void IfGradeIsGreaterThanMinimumPassingGrade_IsPassedShouldBeTrue()
            {
                // Arrange
                var lessonRepository = A.Fake<ILessonRepository>();
                var moduleRepository = A.Fake<IModuleRepository>();

                var lesson = new Lesson { Grade = 2, IsPassed = false, LessonId = LessonId };
                var module = new Module { ModuleId = 1, MinimumPassingGrade = 1, Lessons = new List<Lesson> { lesson } };
                A.CallTo(() => lessonRepository.GetLesson(A<int>.Ignored)).Returns(lesson);
                A.CallTo(() => moduleRepository.GetModule(A<int>.Ignored)).Returns(module);

                var lessonService = new LessonService(lessonRepository, moduleRepository);
                
                // Act
                lessonService.UpdateLessonGrade(LessonId, Grade);

                // Assert
                Assert.Equal(Grade, lesson.Grade);
                Assert.True(lesson.IsPassed);
            }

            [Fact]
            public void IfGradeIsLessThanMinimumPassingGrade_IsPassedShouldBeFalse()
            {
                // Arrange
                var lessonRepository = A.Fake<ILessonRepository>();
                var moduleRepository = A.Fake<IModuleRepository>();

                var lesson = new Lesson { Grade = 1, IsPassed = false, LessonId = LessonId };
                var module = new Module { ModuleId = 1, MinimumPassingGrade = 2, Lessons = new List<Lesson> { lesson } };
                A.CallTo(() => lessonRepository.GetLesson(A<int>.Ignored)).Returns(lesson);
                A.CallTo(() => moduleRepository.GetModule(A<int>.Ignored)).Returns(module);

                var lessonService = new LessonService(lessonRepository, moduleRepository);

                // Act
                lessonService.UpdateLessonGrade(LessonId, Grade);

                // Assert
                Assert.Equal(Grade, lesson.Grade);
                Assert.False(lesson.IsPassed);
            }

            private int LessonId = 1;
            private readonly double Grade = 1.2d;
        }
    }
}
