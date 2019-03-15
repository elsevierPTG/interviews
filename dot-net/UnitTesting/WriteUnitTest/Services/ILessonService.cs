namespace WriteUnitTest.Services
{
    public interface ILessonService
    {
        bool UpdateLessonGrade(int lessonId, double grade);
    }
}