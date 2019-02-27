using Xunit;
using WriteUnitTest.Services;
using WriteUnitTest.Entities;

namespace WriteUnitTest.UnitTests.Services
{
    public class LessonServiceUnitTests
    {
        private LessonService service = null;

        public LessonServiceUnitTests()
        {
            this.service = new LessonService();
        }

        [Theory]
        [InlineData(12, 80.0d, true)]
        [InlineData(46, 65.0d, false)]
        public void UpdateLessonGrade_Validate_IsPassed_Test(int lessonId, double grade, bool expected)
        {
            var lesson = this.service.UpdateLessonGrade(lessonId, grade);

            Assert.Equal(expected, lesson.IsPassed);
        }
    }
}