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
                .UseInMemoryDatabase("ApplicationDatabase")
                .Options;

            _applicationDbContext = new ApplicationDbContext(options);
        }

        public void CreateLesson(string lesson)
        {
        }
    }
}
