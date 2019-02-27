using System.Collections.Generic;
using System.Linq;
using WriteUnitTest.Entities;

namespace WriteUnitTest.Repositories
{
    public class ModuleRepository
    {
        private readonly List<Module> moduleList;

        public ModuleRepository()
        {
            moduleList = new List<Module>
            {
                new Module
                {
                    ModuleId = 873,
                    MinimumPassingGrade = 80
                }
            };
        }

        public Module GetModule(int moduleId)
        {
            return moduleList.FirstOrDefault(x => x.ModuleId == moduleId);
        }
    }
}