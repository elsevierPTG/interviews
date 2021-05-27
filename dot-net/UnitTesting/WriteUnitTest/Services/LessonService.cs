using System;
using WriteUnitTest.Exceptions;
using WriteUnitTest.Repositories;

namespace WriteUnitTest.Services
{
    // Extracted an interface to simplify mocking and facilitate dependency injection
    // Injected repositories to improve testability
    // Throwing NotFoundException to improve maintainability
    public class LessonService : ILessonService
    {
        private readonly ILessonRepository _lessonRepository;
        private readonly IModuleRepository _moduleRepository;

        public LessonService(ILessonRepository lessonRepository, IModuleRepository moduleRepository)
        {
            _moduleRepository = moduleRepository;
            _lessonRepository = lessonRepository;
        }

        public void UpdateLessonGrade(int lessonId, double grade)
        {
            var lesson = _lessonRepository.GetLesson(lessonId);
            if (lesson == null)
                throw new NotFoundException($"Lesson with id {lessonId} doesn't exist");

            lesson.Grade = grade;

            if (lesson.IsPassed)
                return;

            var module = _moduleRepository.GetModule(lessonId);
            if (module == null)
                throw new NotFoundException($"Module with lessonId {lessonId} doesn't exist");

            lesson.IsPassed = grade >= module.MinimumPassingGrade;
        }
    }
}