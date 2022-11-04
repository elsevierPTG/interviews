using WriteUnitTest.Repositories;
using WriteUnitTest.Entities;

namespace WriteUnitTest.Services
{
    public class LessonService
    {
        private ILessonRepository _lessonRepo;
        private IModuleRepository _moduleRepo;

        public LessonService(ILessonRepository lessonRepo, IModuleRepository moduleRepo)
        {
            //moved repository objects to constructor to allow for mocking of output in testing/dependency injection
            _lessonRepo = lessonRepo;
            _moduleRepo = moduleRepo;
        }

        public void UpdateLessonGrade(int lessonId, double grade)
        {
            //var keyword is ambiguous, prefer to specify the obect type whenever possible for ease of reading purposes
            Lesson lesson = _lessonRepo.GetLesson(lessonId);

            lesson.Grade = grade;

            if (!lesson.IsPassed)
            {
                Module module = _moduleRepo.GetModule(lessonId);

                //simplifying boolean expression to single line to make it readable as a single expression instead of an if/else block
                lesson.IsPassed = (grade >= module.MinimumPassingGrade);
            }
        }
    }
}