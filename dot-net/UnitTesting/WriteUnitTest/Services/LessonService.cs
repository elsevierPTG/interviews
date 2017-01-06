using WriteUnitTest.Entities;
using WriteUnitTest.Interfaces;

namespace WriteUnitTest.Services
{
    public class LessonService
    {
        private IRepository<Lesson> lessonRepo;
        private IRepository<Module> moduleRepository; 

        public LessonService(IRepository<Lesson> lessonRepo, IRepository<Module> moduleRepository)
        {
            // With more time, we could implement dependency injection using Unity or Autofac
            this.lessonRepo = lessonRepo;
            this.moduleRepository = moduleRepository;
        }

        // In order to unit test this method, we need a return value since the lesson is not stored anywhere
        public Lesson UpdateLessonGrade(int lessonId, double grade)
        {
            var lesson = lessonRepo.GetById(lessonId);

            lesson.Grade = grade;

            if (!lesson.IsPassed)
            {
                var module = moduleRepository.GetById(lessonId);

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