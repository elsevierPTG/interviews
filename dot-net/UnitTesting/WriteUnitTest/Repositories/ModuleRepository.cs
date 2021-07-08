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
            // If there is a lesson repository, all lessons in the application
            // must come from that repository; otherwise, we are asking for trouble
            var lessonRepo = new LessonRepository();
            Lesson lesson12 = lessonRepo.GetLesson(12);
            Lesson lesson86 = lessonRepo.GetLesson(86);

            moduleList = new List<Module>
            {
                // To simulate persistence, we could use a static field for,
                // but I do not need to test the situations I am concerned 
                // with, I will just leave it here for now.
                new Module
                {
                    ModuleId = 873,
                    MinimumPassingGrade = 80,
                    //Lessons = new List<Lesson>
                    //{
                    //    new Lesson
                    //    {
                    //        LessonId = 12,
                    //        Grade = 63.7d,
                    //        IsPassed = false
                    //    },
                    //    new Lesson
                    //    {
                    //        LessonId = 86,
                    //        Grade = 88.2d,
                    //        IsPassed = true
                    //    }
                    //}                    
                    Lessons = new List<Lesson> { lesson12, lesson86 }
                }
            };
        }

        // We should really be using a module ID to get a module, but I will 
        // not worry about that here
        public Module GetModule(int lessonId)
        {
            // Using a lessonId to find a module opens room for problems when 
            // a lone lesson (one not part of a module) exists
            return moduleList.FirstOrDefault(x => x.Lessons.Any(y => y.LessonId == lessonId));
        }
    }
}