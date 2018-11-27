using WriteUnitTest.Repositories;
using WriteUnitTest.Services;

namespace WriteUnitTest
{
    public class Program
    {
        public static void Main(string[] args)
        {
            var lessonRepository = new LessonRepository();
            var moduleRepository = new ModuleRepository();
            var lessonSvc = new LessonService(lessonRepository, moduleRepository);

            var lessonId = 12;
            var grade = 98.2d;

            lessonSvc.UpdateLessonGrade(lessonId, grade);
        }
    }
}