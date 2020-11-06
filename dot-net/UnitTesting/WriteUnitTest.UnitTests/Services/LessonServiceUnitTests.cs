using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using WriteUnitTest.Repositories;
using WriteUnitTest.Services;


namespace WriteUnitTest.UnitTests.Services
{
    [TestClass]
    public class LessonServiceUnitTests
    {
          private static readonly int lessonId = 12;

          [TestMethod]
          public void UpdateLessonGrade_Test()
          {
               var moduleRepo = new ModuleRepository();
               var lessonService = new LessonService();
               var module = moduleRepo.GetModule(lessonId);

               var grade = new Random().Next(0, 100);
               var isPassing = module.MinimumPassingGrade <= grade;

               try
               {
                    var updatedLesson = lessonService.UpdateLessonGrade(lessonId, grade);
                    Assert.AreEqual(updatedLesson.Grade, grade);
                    Assert.AreEqual(updatedLesson.IsPassed, isPassing);

               }
               catch (Exception e)
               {
                    Console.WriteLine(e);
               }

          }
    }
}
