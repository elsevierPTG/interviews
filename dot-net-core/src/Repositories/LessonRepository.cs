using System;
using Interviews.DbContexts;
using Microsoft.EntityFrameworkCore;

namespace Interviews.Repositories
{
    public class LessonRepository : ILessonRepository
    {
        private readonly ApplicationDbContext _applicationDbContext;

        public LessonRepository()
        {
            var options = new DbContextOptionsBuilder<ApplicationDbContext>()
                .UseInMemoryDatabase(Guid.NewGuid().ToString())
                .Options;

            _applicationDbContext = new ApplicationDbContext(options);
            _applicationDbContext.Database.EnsureDeleted();
        }

        public void CreateLesson(string lesson)
        {
        }
    }
}
