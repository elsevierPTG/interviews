namespace WriteUnitTest.Repositories
{
    using WriteUnitTest.Entities;

    public interface IModuleRepository
    {
        Module GetModule(int lessonId);
    }
}