using WriteUnitTest.Factory;
using WriteUnitTest.Services;

namespace WriteUnitTest
{
    public class Program
    {
        public static void Main(string[] args)
        {
            var lessonSvc = new LessonService(RepositoryFactory.CreateLessonRepository(), RepositoryFactory.CreateModuleRepository());

            var lessonId = 12;

            var grade = 98.2d;

            lessonSvc.UpdateLessonGrade(lessonId, grade);
        }
    }
}