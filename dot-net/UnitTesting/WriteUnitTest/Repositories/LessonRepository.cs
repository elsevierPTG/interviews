using System.Collections.Generic;
using System.Linq;
using WriteUnitTest.Entities;

namespace WriteUnitTest.Repositories
{
    public class LessonRepository
    {
        // This design more adequately mimics a permanent data store.
        // If the data were coming from an external data store, the state of 
        // each lesson would be maintained until they are changed.
        private static readonly IEnumerable<Lesson> _lessonList = new List<Lesson>
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
            },
            new Lesson
            {
                LessonId = 86,
                Grade = 88.2d,
                IsPassed = true
            }
        };

        public Lesson GetLesson(int lessonId)
        {
            return _lessonList.FirstOrDefault(x => x.LessonId == lessonId);
        }
    }
}