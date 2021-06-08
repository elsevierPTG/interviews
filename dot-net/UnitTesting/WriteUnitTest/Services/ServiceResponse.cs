using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using WriteUnitTest.Common;

namespace WriteUnitTest.Services
{
    /// <summary>
    /// This class encapsulates the response information returned from a call
    /// to the LessonService.  Ideally this could be a base class and then have
    /// specific implementations for LessonService, ModuleService, some other
    /// service, etc, but it was kept simple for this exercise.
    /// </summary>
    public class ServiceResponse
    {
        public ServiceResponse()
        {
            Init();
        }

        public ServiceResponse(
            Enums.LessonServiceCodes responseCode = Enums.LessonServiceCodes.Undefined,
            string message = null,
            Exception ex = null)
        {
            Init(responseCode, message, ex);
        }

        private void Init(
            Enums.LessonServiceCodes responseCode = Enums.LessonServiceCodes.Undefined,
            string message = null,
            Exception ex = null)
        {
            ResponseCode = responseCode;
            Message = message;
            Exception = ex;
        }

        public Enums.LessonServiceCodes ResponseCode { get; set; }

        public string Message { get; set; }

        public Exception Exception { get; set; }

        /// <summary>
        /// This could be a derived field based on a few rules or it could be one that
        /// you can directly set.  For this exercise I took the liberty to just do a
        /// simple derived value based on code and exception.
        /// </summary>
        public bool Success => ResponseCode == Enums.LessonServiceCodes.UpdateSuccess && Exception == null;
    }
}
