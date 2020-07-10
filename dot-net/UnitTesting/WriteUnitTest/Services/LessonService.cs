using WriteUnitTest.Repositories;

namespace WriteUnitTest.Services
{
    public class LessonService
    {
        public LessonService()
        {
        }
        /// <summary>
        /// Did the least refactoring required to make the method easily testable 
        /// To get max possible cases out for testing e.g. repo failure.
        /// and still would be able to see if the student has passed the test or not.
        /// </summary>
        /// <param name="lessonId"></param>
        /// <param name="grade"></param>
        /// <param name="isPassed"></param>
        /// <returns></returns>
        public string UpdateLessonGrade(int lessonId, double grade,out bool isPassed)
        {
            isPassed = false;
            var lessonRepo = new LessonRepository();
            var lesson = lessonRepo.GetLesson(lessonId);
            if (lesson == null)
                return "Lesson not Found!";

            lesson.Grade = grade;

            if (!lesson.IsPassed)
            {
                var moduleRepository = new ModuleRepository();
                var module = moduleRepository.GetModule(lessonId);

                if (module == null)
                    return "Module not Found!";

                if (grade >= module.MinimumPassingGrade)
                {
                    lesson.IsPassed = true;
                }
                else
                {
                    lesson.IsPassed = false;
                }
            }
            isPassed = lesson.IsPassed;
            return "Success";
        }
    }
}