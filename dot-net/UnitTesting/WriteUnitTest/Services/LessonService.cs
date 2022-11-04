using WriteUnitTest.Repositories;

namespace WriteUnitTest.Services
{
    public class LessonService
    {
        private readonly ILessonRepository LessonRepository;
        private readonly IModuleRepository ModuleRepository;


        public LessonService()
        {
            LessonRepository = new LessonRepository();
            ModuleRepository = new ModuleRepository();
        }

        public LessonService(ILessonRepository lessonRepository, IModuleRepository moduleRepository)
        {
            LessonRepository = lessonRepository;
            ModuleRepository = moduleRepository;
        }

        public void UpdateLessonGrade(int lessonId, double grade)
        {
            var lesson = LessonRepository.GetLesson(lessonId);

            lesson.Grade = grade;

            if (!lesson.IsPassed)
            {
                var module = ModuleRepository.GetModule(lessonId);

                if (grade >= module.MinimumPassingGrade)
                {
                    lesson.IsPassed = true;
                }
                else
                {
                    lesson.IsPassed = false;
                }
            }
        }
    }
}