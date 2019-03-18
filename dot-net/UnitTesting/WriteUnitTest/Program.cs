namespace WriteUnitTest
{
    using Repositories;
    using Services;

    public class Program
    {
        public static void Main(string[] args)
        {
            var lessonService = new LessonService(new LessonRepository(), new ModuleRepository());

            const int lessonId = 12;
            const double grade = 98.2d;

            lessonService.UpdateLesson(lessonId, grade);
        }
    }
}
