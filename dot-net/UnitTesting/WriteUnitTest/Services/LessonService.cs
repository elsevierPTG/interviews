using WriteUnitTest.Entities;
using WriteUnitTest.Repositories;

namespace WriteUnitTest.Services
{
    public class LessonService
    {
        // Create private fields for repositories to protect them from unwanted modification
        private LessonRepository _LessonRepo;
        private ModuleRepository _ModuleRepository;

        
        public LessonService()
        {
            /* 
             * Instantiate repositories in LessonService constructor so that the instance isn't instantiating
             * repositories on the fly and their state at the time of LessonService's creation is preserved.
             */
            LessonRepo = new LessonRepository();
            ModuleRepository = new ModuleRepository();
        }

        /* 
         * Create public getters for our private fields; protect the setters from outside modification
         * as it doesn't seem necessary to allow outside classes to modify this data.
         */
        public LessonRepository LessonRepo { get => _LessonRepo; protected set => _LessonRepo = value; }
        public ModuleRepository ModuleRepository { get => _ModuleRepository; protected set => _ModuleRepository = value; }

        /// <summary>
        /// Update the grade of a lesson and evaluate whether that lesson is passed or not.
        /// Checks the provided grade against the provided lesson's module data to verify
        /// that the grade is greater than the module's minimum grade. If so, changes 
        /// lesson's IsPassed field to true.
        /// </summary>
        /// <param name="lessonId">The ID of the lesson to be updated</param>
        /// <param name="grade">The grade for the lesson</param>
        public void UpdateLessonGrade(int lessonId, double grade)
        {
            Lesson lesson = LessonRepo.GetLesson(lessonId);

            //Throw an exception if no lesson is found and allow caller to handle the error.
            if(lesson ==null)
            {
                throw new System.ArgumentOutOfRangeException("lessonId", lessonId, "Lesson id not found!");
            }
            
            lesson.Grade = grade;

            if (!lesson.IsPassed)
            {
                Module module = ModuleRepository.GetModule(lessonId);
                //Throw an exception if no module is found and allow caller to handle the error.
                if (module == null)
                {
                    throw new System.ArgumentOutOfRangeException("lessonId", lessonId, "No module found for lesson!");
                }

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