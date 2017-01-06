using System;
using System.Collections.Generic;

namespace WriteUnitTest.Repositories
{
    public class RepositoryBase<T> where T:class 
    {
        public void InitializeRepository(Func<List<T>> initializer)
        {
            dataList = initializer();
        }

        protected List<T> dataList; 
    }
}
