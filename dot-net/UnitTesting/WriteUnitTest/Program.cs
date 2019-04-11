using StructureMap;
using WriteUnitTest.Services;

namespace WriteUnitTest
{
    public class Program
    {
        public static void Main(string[] args)
        {
            // Added IoC container to simplify dependency management
            var container = new Container(c =>
            {
                // Automatically resolving classes without configuration
                c.Scan(_ =>
                {
                    _.AssembliesAndExecutablesFromApplicationBaseDirectory();
                    _.WithDefaultConventions();
                });
            });

            var lessonSvc = container.GetInstance<ILessonService>();

            const int lessonId = 12;
            const double grade = 98.2d;
            lessonSvc.UpdateLessonGrade(lessonId, grade);            
        }
    }
}