using System;
using System.Collections.Generic;
using FakeItEasy;
using NUnit.Framework;
using WriteUnitTest.Entities;
using WriteUnitTest.Repositories;
using WriteUnitTest.Services;

namespace WriteUnitTest.UnitTests.Services
{
    [TestFixture]
    public class LessonServiceUnitTests
    {
        private ILessonService _lessonService;
        private ILessonRepository _lessonRepository;
        private IModuleRepository _moduleRepository;

        [SetUp]
        public void Init()
        {
            _lessonRepository = A.Fake<ILessonRepository>();
            _moduleRepository = A.Fake<IModuleRepository>();
            _lessonService = new LessonService(_lessonRepository, _moduleRepository);
        }

        [Test]
        public void when_passing_valid_lessonid_update_lesson_grade()
        {
            const int lessonId = 12;
            const double grade = 63.7d;
            var fakeLesson = new Lesson
            {
                Grade = grade,
                IsPassed = false,
                LessonId = lessonId
            };
            //Arrange
            A.CallTo(() => _lessonRepository.GetLesson(lessonId)).Returns(fakeLesson);
            A.CallTo(() => _moduleRepository.GetModule(lessonId)).Returns(new Module
            {
                Lessons = new List<Lesson>{ fakeLesson },
                MinimumPassingGrade = 80,
                ModuleId = 873
            });

            //Act
            _lessonService.UpdateLessonGrade(lessonId, grade);

            //Assert
            A.CallTo(() => _lessonRepository.GetLesson(A<int>.Ignored)).MustHaveHappenedOnceExactly();
            A.CallTo(() => _moduleRepository.GetModule(A<int>.Ignored)).MustHaveHappenedOnceExactly();
        }

        [Test]
        public void when_passing_invalid_lessonid_to_lesson_throws_exception()
        {
            const int lessonId = 20;
            const double grade = 20.5d;
            //Arrange
            A.CallTo(() => _lessonRepository.GetLesson(lessonId)).Returns(null);

            //Act

            //Assert
            Assert.Throws<NullReferenceException>(() => _lessonService.UpdateLessonGrade(lessonId, grade));
            A.CallTo(() => _lessonRepository.GetLesson(A<int>.Ignored)).MustHaveHappenedOnceExactly();
            A.CallTo(() => _moduleRepository.GetModule(A<int>.Ignored)).MustNotHaveHappened();
        }

        [Test]
        public void when_passing_invalid_lessonid_to_module_throws_exception()
        {
            //Arrange
            const int lessonId = 20;
            const double grade = 20.5d;
            A.CallTo(() => _lessonRepository.GetLesson(lessonId)).Returns(new Lesson
            {
                Grade = grade,
                IsPassed = false,
                LessonId = lessonId
            });
            A.CallTo(() => _moduleRepository.GetModule(lessonId)).Returns(null);

            //Act

            //Assert
            Assert.Throws<NullReferenceException>(() => _lessonService.UpdateLessonGrade(lessonId, grade));
            A.CallTo(() => _lessonRepository.GetLesson(A<int>.Ignored)).MustHaveHappenedOnceExactly();
            A.CallTo(() => _moduleRepository.GetModule(A<int>.Ignored)).MustHaveHappenedOnceExactly();
        }
    }
}