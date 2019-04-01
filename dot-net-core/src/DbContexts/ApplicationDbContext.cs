using Interview.Entities;
using Microsoft.EntityFrameworkCore;

namespace Interviews.DbContexts
{
    public class ApplicationDbContext : DbContext
    {
        public virtual DbSet<UserEntity> Users { get; set; }

        public virtual DbSet<LessonEntity> Lessons { get; set; }

        public ApplicationDbContext(DbContextOptions<ApplicationDbContext> options)
            : base(options)
        {
        }
    }
}