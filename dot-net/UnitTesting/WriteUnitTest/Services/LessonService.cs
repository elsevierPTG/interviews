using System;
using WriteUnitTest.Entities;
using WriteUnitTest.Repositories;

namespace WriteUnitTest.Services
{
    public class LessonService
    {
        public LessonService()
        {
        }

        public Lesson UpdateLessonGrade(int lessonId, double grade)
        {
            if(grade < 0 || grade > 100)
                throw new ArgumentException("Grade should be greater than or equal to zero, and less than 100", nameof(grade));

            var lessonRepo = new LessonRepository();
            var lesson = lessonRepo.GetLesson(lessonId);

            if(lesson == null)
                throw new Exception($"Could not find lesson with lessonId: {lessonId}");

            lesson.Grade = grade;

            if (!lesson.IsPassed)
            {
                var moduleRepository = new ModuleRepository();
                var module = moduleRepository.GetModule(lessonId);

                if(module == null)
                    throw new Exception($"Could not find module with lessonId: {lessonId}");

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