using System.Collections.Generic;
using System.Linq;
using WriteUnitTest.Entities;

namespace WriteUnitTest.Repositories
{
    public class LessonRepository
    {
        private readonly List<Lesson> lessonList;

        public LessonRepository()
        {
            lessonList = new List<Lesson>
            {
                new Lesson
                {
                    ModuleId = 873,
                    LessonId = 12,
                    Grade = 63.7d,
                    IsPassed = false
                },
                new Lesson
                {
                    ModuleId = 873,
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