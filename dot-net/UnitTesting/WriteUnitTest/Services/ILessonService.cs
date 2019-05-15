using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace WriteUnitTest.Services
{
    public interface ILessonService
    {
        void UpdateLessonGrade(int lessonId, double grade);
    }
}
