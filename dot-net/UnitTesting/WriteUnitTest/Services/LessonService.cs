using WriteUnitTest.Entities;
using WriteUnitTest.Interfaces;

namespace WriteUnitTest.Services
{
    public class LessonService
    {
        private readonly ILessonRepository _lessonRepository;
        private readonly IModuleRepository _moduleRepository;

        public LessonService(ILessonRepository lessonRepository, IModuleRepository moduleRepository)
        {
            _lessonRepository = lessonRepository;
            _moduleRepository = moduleRepository;
        }

        public Lesson UpdateLessonGrade(int lessonId, double grade)
        {
            var lesson = _lessonRepository.GetLesson(lessonId);

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

            return lesson;
        }
    }
}