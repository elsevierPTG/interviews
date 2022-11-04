using System;

namespace ExampleProgram
{
    public class Program
    {
        public static void Main(string[] args)
        {
            var exampleClass = new ExampleClass();

            Console.Write(exampleClass.ExampleMethod("ExampleText.txt"));
            Console.Write("Press Any Key to Exit");
            Console.ReadKey();
        }
    }
}