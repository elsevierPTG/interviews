using WriteUnitTest.Entities;

namespace WriteUnitTest.Repositories
{
    public interface ILessonRepository
    {
        Lesson GetLesson(int lessonId);
    }
}