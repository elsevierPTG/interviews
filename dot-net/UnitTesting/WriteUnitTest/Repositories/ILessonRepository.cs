using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using WriteUnitTest.Entities;

namespace WriteUnitTest.Repositories
{
    public interface ILessonRepository
    {
        Lesson GetLesson(int lessonId);
    }
}
