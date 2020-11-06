namespace WriteUnitTest.Repositories
{
    using Entities;
    using System.Collections.Generic;
    using System.Linq;

    public class LessonRepository : ILessonRepository
    {
        private readonly List<Lesson> lessonList;

        public LessonRepository()
        {
            lessonList = new List<Lesson>
            {
                new Lesson
                {
                    LessonId = 12,
                    Grade = 63.7d,
                    IsPassed = false
                },
                new Lesson
                {
                    LessonId = 46,
                    Grade = 0.0d,
                    IsPassed = false
                }
            };
        }

        public Lesson GetLesson(int lessonId)
        {
            return lessonList.FirstOrDefault(x => x.LessonId == lessonId);
        }
    }
}
