using System.Collections.Generic;
using System.Linq;
using WriteUnitTest.Entities;

namespace WriteUnitTest.Repositories
{
    public class LessonRepository : ILessonRepository
    {
        private readonly List<Lesson> _lessonList;

        public LessonRepository()
        {
            _lessonList = new List<Lesson>
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
            return _lessonList.FirstOrDefault(x => x.LessonId == lessonId);
        }
    }
}