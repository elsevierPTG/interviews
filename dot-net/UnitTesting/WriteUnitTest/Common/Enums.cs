using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace WriteUnitTest.Common
{
    public static class Enums
    {
        /// <summary>
        /// This enum contains the minimal values for returning status from the service,
        /// necessary for covering the basics of this unit test exercise.
        /// </summary>
        public enum LessonServiceCodes
        {
            Undefined = 0,
            UpdateSuccess = 10,
            InvalidLessonId = 20,
            InvalidLessonIdForModule = 30,
            InvalidGrade = 40,
            Exception = 50
        }
    }
}
