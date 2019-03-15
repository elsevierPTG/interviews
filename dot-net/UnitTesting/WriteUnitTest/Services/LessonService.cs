namespace WriteUnitTest.Services
{
    using WriteUnitTest.Repositories;

    public class LessonService : ILessonService
    {
        private readonly ILessonRepository _lessonRepository;
        private readonly IModuleRepository _moduleRepository;

        public LessonService(ILessonRepository lessonRepository = null, IModuleRepository moduleRepository = null)
        {
            _lessonRepository = lessonRepository ?? new LessonRepository();
            _moduleRepository = moduleRepository ?? new ModuleRepository();
        }

        public bool UpdateLessonGrade(int lessonId, double grade)
        {
            var lesson = _lessonRepository.GetLesson(lessonId);

            if (lesson == null)
                return false;

            lesson.Grade = grade;

            if (!lesson.IsPassed)
            {
                var module = _moduleRepository.GetModule(lessonId);

                if (module == null)
                    return false;

                if (grade >= module.MinimumPassingGrade)
                {
                    lesson.IsPassed = true;
                }
                else
                {
                    lesson.IsPassed = false;
                }
            }

            return true;
        }
    }
}