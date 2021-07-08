using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using WriteUnitTest.Services;
using Assert = Xunit.Assert;

namespace WriteUnitTest.UnitTests.Services
{
    [TestClass]
    public class LessonServiceUnitTests
    {
        [TestMethod]
        public void UpdateLessonGrade_WithInvalidLessThanZeroGrade_ThrowsArgumentException()
        {
            var lessonId = 3;
            var invalidGrade = -1;
            Assert.Throws<ArgumentException>(() => new LessonService().UpdateLessonGrade(lessonId, invalidGrade));
        }

        [TestMethod]
        public void UpdateLessonGrade_WithInvalidGreaterThan100Grade_ThrowsArgumentException()
        {
            var lessonId = 3;
            var invalidGrade = 101;
            Assert.Throws<ArgumentException>(() => new LessonService().UpdateLessonGrade(lessonId, invalidGrade));
        }

        [TestMethod]
        public void UpdateLessonGrade_WithInvalidLessonId_ThrowsException()
        {
            var lessonId = 3;
            var grade = 75;
            Assert.Throws<Exception>(() => new LessonService().UpdateLessonGrade(lessonId, grade));
        }

        [TestMethod]
        public void UpdateLessonGrade_WithPassingLesson_ReturnsPassedLesson()
        {
            var lessonId = 50;
            var grade = 35;
            var lesson = new LessonService().UpdateLessonGrade(lessonId, grade);
            Assert.NotNull(lesson);
            Assert.Equal(50, lesson.LessonId);
            Assert.Equal(35, lesson.Grade);
            Assert.True(lesson.IsPassed);
        }

        [TestMethod]
        public void UpdateLessonGrade_WithMissingModule_ThrowsException()
        {
            var lessonId = 15;
            var grade = 35;
            Assert.Throws<Exception>(() => new LessonService().UpdateLessonGrade(lessonId, grade));
        }

        [TestMethod]
        public void UpdateLessonGrade_WithFailingGrade_ReturnsFailedLesson()
        {
            var lessonId = 12;
            var grade = 35;
            var lesson = new LessonService().UpdateLessonGrade(lessonId, grade);
            Assert.NotNull(lesson);
            Assert.Equal(12, lesson.LessonId);
            Assert.Equal(35, lesson.Grade);
            Assert.False(lesson.IsPassed);
        }

        [TestMethod]
        public void UpdateLessonGrade_WithPassingGrade_ReturnsPassedLesson()
        {
            var lessonId = 12;
            var grade = 85;
            var lesson = new LessonService().UpdateLessonGrade(lessonId, grade);
            Assert.NotNull(lesson);
            Assert.Equal(12, lesson.LessonId);
            Assert.Equal(85, lesson.Grade);
            Assert.True(lesson.IsPassed);
        }
    }
}