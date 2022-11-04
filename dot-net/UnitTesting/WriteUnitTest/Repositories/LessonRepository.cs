﻿using System.Collections.Generic;
using System.Linq;
using WriteUnitTest.Entities;

namespace WriteUnitTest.Repositories
{
    // Extracted an interface to simplify mocking
    public class LessonRepository : ILessonRepository
    {
        private readonly List<Lesson> lessonList;

        public LessonRepository()
        {
            lessonList = new List<Lesson>
            {
                new Lesson
                {
                    LessonId = 12,
                    Grade = 63.7d,
                    IsPassed = false
                },
                new Lesson
                {
                    LessonId = 46,
                    Grade = 0.0d,
                    IsPassed = false
                }
            };
        }

        public Lesson GetLesson(int lessonId)
        {
            return lessonList.FirstOrDefault(x => x.LessonId == lessonId);
        }
    }
}