using System;
using Interviews.Services;
using Microsoft.Extensions.DependencyInjection;
using Microsoft.Extensions.Logging;

namespace Interviews
{
    class Program
    {
        static void Main(string[] args)
        {
            var services = BuildServiceProvider(args);

            var logger = services.GetRequiredService<ILogger<Program>>();
            logger.LogDebug("Starting application");

            // coordinates test execution
            var testService = services.GetService<ITestService>();

            // step 1
            testService.ExecuteStep1();

            // step 2
            testService.ExecuteStep2();

            // step 3
            testService.ExecuteStep3();

            // step 4
            testService.ExecuteStep4();

            logger.LogDebug("All done!");

            // needed to get the logger to flush
            services.Dispose();
        }

        public static ServiceProvider BuildServiceProvider(string[] args) =>
            // setup our DI
            new ServiceCollection()
                .AddLogging((logging) =>
                {
                    // configure console logging
                    logging.AddConsole();
                    logging.SetMinimumLevel(LogLevel.Debug);
                })
                .AddSingleton<ITestService, TestService>()
                .BuildServiceProvider();
    }
}
