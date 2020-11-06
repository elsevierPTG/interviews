namespace WriteUnitTest.Repositories
{
    using Entities;

    public interface ILessonRepository
    {
        Lesson GetLesson(int lessonId);
    }
}
