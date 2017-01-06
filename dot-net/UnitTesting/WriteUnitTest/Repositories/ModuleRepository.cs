using System.Collections.Generic;
using System.Linq;
using WriteUnitTest.Entities;
using WriteUnitTest.Interfaces;

namespace WriteUnitTest.Repositories
{
    public class ModuleRepository : RepositoryBase<Module>, IRepository<Module>
    {
        public ModuleRepository()
        {
            InitializeRepository(CollectionInitializer);
        }

        public Module GetById(int id)
        {
            return dataList.FirstOrDefault(x => x.Lessons.Any(y => y.LessonId == id));
        }


        public List<Module> CollectionInitializer()
        {
            return new List<Module>
            {
                new Module
                {
                    ModuleId = 873,
                    MinimumPassingGrade = 80,
                    Lessons = new List<Lesson>
                    {
                        new Lesson
                        {
                            LessonId = 12,
                            Grade = 63.7d,
                            IsPassed = false
                        },
                        new Lesson
                        {
                            LessonId = 86,
                            Grade = 88.2d,
                            IsPassed = true
                        }
                    }
                }
            };
        }
    }
}