using System.Collections.Generic;
using System.Linq;
using WriteUnitTest.Entities;
using WriteUnitTest.Interfaces;

namespace WriteUnitTest.Repositories
{
    public class LessonRepository : RepositoryBase<Lesson>, IRepository<Lesson>
    {
        public LessonRepository()
        {
            InitializeRepository(CollectionInitializer);
        }

        /// <summary>
        ///  Use interface method here in order to facilitate mocking
        /// </summary>
        /// <param name="id"></param>
        /// <returns></returns>
        public Lesson GetById(int id)
        {
            return dataList.FirstOrDefault(x => x.LessonId == id);
        }

        public List<Lesson> CollectionInitializer()
        {
            return new List<Lesson>
            {
                new Lesson
                {
                    LessonId = 12,
                    Grade = 63.7d,
                    IsPassed = false
                },
                new Lesson
                {
                    LessonId = 46,
                    Grade = 0.0d,
                    IsPassed = false
                }
            };
        }
    }
}