using System;
using System.Collections.Generic;

namespace WriteUnitTest.Interfaces
{
    public interface IRepository<T> where T : class
    {
        T GetById(int id);
        List<T> CollectionInitializer();
    }
}
