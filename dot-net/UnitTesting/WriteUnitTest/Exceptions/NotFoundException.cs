using System;
using System.Runtime.Serialization;

namespace WriteUnitTest.Exceptions
{
    public class NotFoundException : Exception
    {
        public NotFoundException(string message) : base(message)
        {
        }
    }
}