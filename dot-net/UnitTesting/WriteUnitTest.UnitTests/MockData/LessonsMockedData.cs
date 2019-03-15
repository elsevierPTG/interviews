namespace WriteUnitTest.UnitTests.MockData
{
    using WriteUnitTest.Entities;

    public static class LessonsMockedData
    {
        public static readonly Lesson LessonDataIsPassed =
            new Lesson
            {
                LessonId = 1,
                Grade = 90.1d,
                IsPassed = true
            };

        public static readonly Lesson LessonDataIsNotPassed =
            new Lesson
            {
                LessonId = 1,
                Grade = 30.1d,
                IsPassed = false
            };
    }
}
