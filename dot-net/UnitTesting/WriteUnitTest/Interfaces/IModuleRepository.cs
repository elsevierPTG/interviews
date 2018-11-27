using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using WriteUnitTest.Entities;

namespace WriteUnitTest.Interfaces
{
    public interface IModuleRepository
    {
        Module GetModule(int lessonId);
    }
}
