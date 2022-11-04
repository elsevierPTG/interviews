namespace WriteUnitTest.Repositories
{
    using Entities;

    public interface IModuleRepository
    {
        Module GetModule(int lessonId);
    }
}
