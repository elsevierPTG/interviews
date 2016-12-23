using WriteUnitTest.Repositories;

namespace WriteUnitTest.Services
{
    public class LessonService
    {
        public LessonRepository lessonRepo { get; set; }

        public LessonService()
        {
            lessonRepo = new LessonRepository();
        }

        public void UpdateLessonGrade(int lessonId, double grade)
        {
            var lesson = lessonRepo.GetLesson(lessonId);

            lesson.Grade = grade;

            if (!lesson.IsPassed)
            {
                var moduleRepository = new ModuleRepository();
                var module = moduleRepository.GetModule(lessonId);

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