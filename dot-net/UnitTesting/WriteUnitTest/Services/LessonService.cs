using WriteUnitTest.Repositories;
using WriteUnitTest.Entities;

namespace WriteUnitTest.Services
{
    public class LessonService
    {
        public LessonService()
        {
        }

        public Lesson UpdateLessonGrade(int lessonId, double grade)
        {
            var lessonRepo = new LessonRepository();
            var lesson = lessonRepo.GetLesson(lessonId);

            lesson.Grade = grade;

            if (!lesson.IsPassed)
            {
                var moduleRepository = new ModuleRepository();
                var module = moduleRepository.GetModule(lesson.ModuleId);

                lesson.IsPassed = (grade >= module.MinimumPassingGrade);
            }

            return lesson;
        }
    }
}