namespace WriteUnitTest.Services
{
    using Entities;
    using Repositories;

    public class LessonService
    {
        private readonly ILessonRepository lessonRepository;
        private readonly IModuleRepository moduleRepository;

        public LessonService(ILessonRepository lessonRepository, IModuleRepository moduleRepository)
        {
            this.lessonRepository = lessonRepository;
            this.moduleRepository = moduleRepository;
        }

        public Lesson UpdateLesson(int lessonId, double grade)
        {
            var lesson = lessonRepository.GetLesson(lessonId);
            if (lesson == null)
            {
                return null;
            }

            if (lesson.IsPassed)
            {
                return lesson;
            }

            lesson.Grade = grade;

            var module = moduleRepository.GetModule(lessonId);
            if (module == null)
            {
                return lesson;
            }

            lesson.IsPassed = grade >= module.MinimumPassingGrade;
            return lesson;
        }
    }
}
