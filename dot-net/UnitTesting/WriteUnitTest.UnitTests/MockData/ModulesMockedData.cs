namespace WriteUnitTest.UnitTests.MockData
{
    using System.Collections.Generic;
    using WriteUnitTest.Entities;

    public static class ModulesMockedData
    {
        public static readonly Module ModulesData =
            new Module
            {
                ModuleId = 873,
                MinimumPassingGrade = 80,
                Lessons = new List<Lesson>
                    {
                        new Lesson
                        {
                            LessonId = 12,
                            Grade = 63.7d,
                            IsPassed = false
                        },
                        new Lesson
                        {
                            LessonId = 86,
                            Grade = 88.2d,
                            IsPassed = true
                        }
                    }
            };
    }
}
