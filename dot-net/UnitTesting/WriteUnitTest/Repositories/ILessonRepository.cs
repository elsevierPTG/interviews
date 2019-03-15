namespace WriteUnitTest.Repositories
{
    using WriteUnitTest.Entities;

    public interface ILessonRepository
    {
        Lesson GetLesson(int lessonId);
    }
}