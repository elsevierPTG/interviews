using System;
using WriteUnitTest.Repositories;
using WriteUnitTest.Common;

namespace WriteUnitTest.Services
{
    public class LessonService
    {
        public LessonService()
        {
        }

        public ServiceResponse UpdateLessonGrade(int lessonId, double grade)
        {
            var response = new ServiceResponse();

            try
            {
                if (!IsGradeValid(grade))
                {
                    // I would not set hard-coded strings like this, but I didn't
                    // want to exhaust every little detail for this exercise
                    response.Message = "Grade is invalid.";
                    response.ResponseCode = Enums.LessonServiceCodes.InvalidGrade;

                    return response;
                }

                var lessonRepo = new LessonRepository();
                var lesson = lessonRepo.GetLesson(lessonId);

                if (!IsLessonValid(lesson))
                {
                    // again, I would not hard-code strings like this
                    response.Message = "Lesson was not found for the given Lesson Id";
                    response.ResponseCode = Enums.LessonServiceCodes.InvalidLessonId;

                    return response;
                }

                lesson.Grade = grade;

                if (!lesson.IsPassed)
                {
                    var moduleRepository = new ModuleRepository();
                    var module = moduleRepository.GetModule(lessonId);

                    if (!IsModuleValid(module))
                    {
                        response.Message = "Module was not found for the given Lesson Id";
                        response.ResponseCode = Enums.LessonServiceCodes.InvalidLessonIdForModule;

                        return response;
                    }

                    lesson.IsPassed = (grade >= module.MinimumPassingGrade);
                }

                response.ResponseCode = Enums.LessonServiceCodes.UpdateSuccess;
            }
            catch (Exception ex)
            {
                response.ResponseCode = Enums.LessonServiceCodes.Exception;
                response.Exception = ex;
            }

            return response;
        }

        /// <summary>
        /// Ideally I would have some sort of Validation class to run items through,
        /// but for this exercise I'm just using a simple private method for demonstration.
        /// </summary>
        /// <param name="grade"></param>
        /// <returns></returns>
        private bool IsGradeValid(double grade)
        {
            // just using normal grading scale here, but it could be anything and it
            // should be something configurable that is initialized in the Validation
            // class, if there was such a class

            return grade >= 0 && grade <= 100;
        }

        /// <summary>
        /// As is the case with IsGradeValid, ideally I would have some sort of Validation
        /// class to run items through, but for this exercise I'm just using a simple private
        /// method for demonstration.
        /// </summary>
        /// <param name="lesson"></param>
        /// <returns></returns>
        private bool IsLessonValid(Entities.Lesson lesson)
        {
            // just doing a null check, but this could be something more extensive

            return lesson != null;
        }

        // same explanation as IsLessonValid
        private bool IsModuleValid(Entities.Module module)
        {
            return module != null;
        }
    }
}
