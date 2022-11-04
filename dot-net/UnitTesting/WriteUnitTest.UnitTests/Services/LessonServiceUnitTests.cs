using Microsoft.VisualStudio.TestTools.UnitTesting;
using System.Collections.Generic;
using System.Linq;
using WriteUnitTest.Entities;
using WriteUnitTest.Repositories;
using WriteUnitTest.Services;

namespace WriteUnitTest.UnitTests.Services
{
    [TestClass]
    public class LessonServiceUnitTests
    {
        [TestMethod]
        public void UpdateLessonGrade_PassingGradeSetWithAGradeGreaterThanMinimumPassingGrade()
        {
            var fakeLessonRepo = new LessonRepoFake();
            var fakeModuleRepo = new ModuleRepoFake();
            var lessonId = 1;
            var lessonService = new LessonService(fakeLessonRepo, fakeModuleRepo);

            lessonService.UpdateLessonGrade(lessonId, 81);

            Assert.IsTrue(fakeLessonRepo.lessonList.FirstOrDefault(x => x.LessonId == lessonId).IsPassed);
        }

        [TestMethod]
        public void UpdateLessonGrade_PassingGradeSetWithAGradeEqualToMinimumPassingGrade()
        {
            var fakeLessonRepo = new LessonRepoFake();
            var fakeModuleRepo = new ModuleRepoFake();
            var lessonId = 1;
            var lessonService = new LessonService(fakeLessonRepo, fakeModuleRepo);

            lessonService.UpdateLessonGrade(lessonId, 80);

            Assert.IsTrue(fakeLessonRepo.lessonList.FirstOrDefault(x => x.LessonId == lessonId).IsPassed);
        }

        [TestMethod]
        public void UpdateLessonGrade_FailingGradeSetWithAGradeLessThanMinimumPassingGrade()
        {
            var fakeLessonRepo = new LessonRepoFake();
            var fakeModuleRepo = new ModuleRepoFake();
            var lessonId = 1;
            var lessonService = new LessonService(fakeLessonRepo, fakeModuleRepo);

            lessonService.UpdateLessonGrade(lessonId, 79);

            Assert.IsFalse(fakeLessonRepo.lessonList.FirstOrDefault(x => x.LessonId == lessonId).IsPassed);
        }

        // Additional tests should include
        // Invalid LessonIds
        // Grades below 0 or above 100 (assuming this matches the business rules)
        // Module with no MinimumPassingGrade

    }


    public class LessonRepoFake : ILessonRepository
    {
        public readonly List<Lesson> lessonList;

        public LessonRepoFake()
        {
            lessonList = new List<Lesson>
            {
                new Lesson
                {
                    LessonId = 1,
                    Grade = 63.7d,
                    IsPassed = false
                },
                new Lesson
                {
                    LessonId = 9,
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

    public class ModuleRepoFake : IModuleRepository
    {
        public readonly List<Module> moduleList;

        public ModuleRepoFake()
        {
            moduleList = new List<Module>
            {
                new Module
                {
                    ModuleId = 873,
                    MinimumPassingGrade = 80,
                    Lessons = new List<Lesson>
                    {
                        new Lesson
                        {
                            LessonId = 1,
                            Grade = 63.7d,
                            IsPassed = false
                        },
                        new Lesson
                        {
                            LessonId = 9,
                            Grade = 88.2d,
                            IsPassed = true
                        }
                    }
                }
            };
        }

        public Module GetModule(int lessonId)
        {
            return moduleList.FirstOrDefault(x => x.Lessons.Any(y => y.LessonId == lessonId));
        }
    }
}