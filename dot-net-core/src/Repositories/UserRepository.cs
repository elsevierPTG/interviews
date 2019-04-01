using System;
using Interviews.DbContexts;
using Microsoft.EntityFrameworkCore;

namespace Interviews.Repositories
{
    public class UserRepository : IUserRepository
    {
        private readonly ApplicationDbContext _applicationDbContext;

        public UserRepository()
        {
            var options = new DbContextOptionsBuilder<ApplicationDbContext>()
                .UseInMemoryDatabase("ApplicationDatabase")
                .Options;

            _applicationDbContext = new ApplicationDbContext(options);
        }

        public void CreateUser(string user)
        {
        }
    }
}