using WriteUnitTest.Entities;

namespace WriteUnitTest.Repositories
{
    public interface IModuleRepository
    {
        Module GetModule(int lessonId);
    }
}