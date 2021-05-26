using WriteUnitTest.Repositories;
using WriteUnitTest.Services;

namespace WriteUnitTest
{
    public class Program
    {
        public static void Main(string[] args)
        {
            //var keyword is ambiguous, prefer to specify the obejct type whenever possible for ease of reading purposes
            //mapping interfaces to repository classes
            ILessonRepository lessonRepo = new LessonRepository();
            IModuleRepository moduleRepo = new ModuleRepository();

            LessonService lessonSvc = new LessonService(lessonRepo, moduleRepo);

            int lessonId = 12;

            double grade = 98.2d;

            lessonSvc.UpdateLessonGrade(lessonId, grade);
        }
    }
}