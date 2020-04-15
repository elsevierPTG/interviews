using WriteUnitTest.Interfaces;
using WriteUnitTest.Repositories;

namespace WriteUnitTest.Services
{
    public class LessonService
    {
        private readonly ILessonRepository _lessonRepo;
        private readonly IModuleRepository _moduleRepository;

        public LessonService(ILessonRepository lessonRepo, IModuleRepository moduleRepository)
        {
            _lessonRepo = lessonRepo;
            _moduleRepository = moduleRepository;
        }

        public void UpdateLessonGrade(int lessonId, double grade)
        {
            var lesson = _lessonRepo.GetLesson(lessonId);

            lesson.Grade = grade;

            if (!lesson.IsPassed)
            {
                var module = _moduleRepository.GetModule(lessonId);

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