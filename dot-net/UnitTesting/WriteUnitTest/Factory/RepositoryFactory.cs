using WriteUnitTest.Repositories;

namespace WriteUnitTest.Factory
{
    public class RepositoryFactory
    {
        // Create static methods to generate the repositories. With more time we could instead use a dependency injection framework
        public static LessonRepository CreateLessonRepository()
        {
            return new LessonRepository();
        }

        public static ModuleRepository CreateModuleRepository()
        {
            return new ModuleRepository();
        }
    }
}
