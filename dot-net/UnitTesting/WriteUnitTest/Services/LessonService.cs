using System;
using WriteUnitTest.Repositories;

namespace WriteUnitTest.Services
{
    public class LessonService : ILessonService
    {
        private readonly ILessonRepository _lessonRepository;
        private readonly IModuleRepository _moduleRepository;
        public LessonService(ILessonRepository lessonRepository, IModuleRepository moduleRepository)
        {
            _lessonRepository = lessonRepository;
            _moduleRepository = moduleRepository;
        }

        public void UpdateLessonGrade(int lessonId, double grade)
        {
            var lesson = _lessonRepository.GetLesson(lessonId);
            if (lesson == null) throw new NullReferenceException();
            lesson.Grade = grade;

            if (lesson.IsPassed) return;

            var module = _moduleRepository.GetModule(lessonId);
            if (module == null) throw new NullReferenceException();
            lesson.IsPassed = grade >= module.MinimumPassingGrade;
        }
    }
}