// using Microsoft.VisualStudio.TestTools.UnitTesting;
using NUnit.Framework;
using System;
using WriteUnitTest.Entities;
using WriteUnitTest.Repositories;
using WriteUnitTest.Services;

namespace WriteUnitTest.UnitTests.Services
{
    [TestFixture]
    public class WhenTestingLessonService
    {
        private LessonRepository _lessonRepo;

        [SetUp]
        public void Setup()
        {
            // Let's make sure every test starts with a clean slate
            _lessonRepo = new LessonRepository();
        }


        [Category("Sad Path")]
        [Test]
        public void UpdateLessonGradeShouldThrowNullExceptionWithInvalidLessonId()
        {
            var lessonService = new LessonService();
            const int LESSON_ID = 5; // Invalid lesson ID
            const double LESSON_GRADE = 80.0;
            Assert.Throws<NullReferenceException>(() => lessonService.UpdateLessonGrade(LESSON_ID, LESSON_GRADE));
        }


        [Category("Sad Path")]
        [Test]
        public void UpdateLessonGradeShouldThrowNullExceptionWhenModuleDoesNotHaveGivenLessonId()
        {
            // This test proves that it is a bad idea to request a module using a lesson ID
            var lessonService = new LessonService();
            const int LESSON_ID = 46; // Valid lesson ID, but is not found in a module; therefore, no module is returned
            const double LESSON_GRADE = 80.0;
            Assert.Throws<NullReferenceException>(() => lessonService.UpdateLessonGrade(LESSON_ID, LESSON_GRADE));
        }


        [Category("Happy Path")]
        [Test]
        public void UpdateLessonGradeShouldSetLessonToPassStatusIfGradeIs80OrAbove()
        {
            const int EXISTING_LESSON_ID = 12;
            const double PASSING_GRADE = 85;

            // Let's make sure the lesson's pass status is set to false before we update it
            Lesson lesson = _lessonRepo.GetLesson(EXISTING_LESSON_ID);
            Assert.IsFalse(lesson.IsPassed, "The lesson's passed status was set somewhere else");

            var lessonService = new LessonService();
            lessonService.UpdateLessonGrade(EXISTING_LESSON_ID, PASSING_GRADE);
            Assert.IsTrue(lesson.IsPassed, "The lesson's passed status wasn't set correctly");
        }


        [Category("Happy Path")]
        [Test]
        public void UpdateLessonGradeShouldSetLessonToFailStatusIfGradeIsBelow80()
        {
            const int EXISTING_LESSON_ID = 86;
            const double PASSING_GRADE = 76;

            Lesson lesson = _lessonRepo.GetLesson(EXISTING_LESSON_ID);
            Assert.IsTrue(lesson.IsPassed, "The lesson's passed status was set somewhere else");

            var lessonService = new LessonService();
            lessonService.UpdateLessonGrade(EXISTING_LESSON_ID, PASSING_GRADE);

            Assert.IsFalse(lesson.IsPassed, "The lesson's passed status wasn't set correctly");
        }
    }
}