using System;
using System.Diagnostics;
using System.Linq;
using System.Threading.Tasks;

namespace fizzbuzz
{
    class Program
    {
        static void Main(string[] args)
        {
            var sw = new Stopwatch();
            sw.Start();
            var result = Enumerable.Range(1, 1000000).Select(e =>
            {
                var isMultipleOf3 = e % 3 == 0;
                var isMultipleOf5 = e % 5 == 0;
                if (isMultipleOf3 && isMultipleOf5)
                {
                    return "FizzBuzz\n";
                }

                if (isMultipleOf5)
                {
                    return "Buzz\n";
                }

                return isMultipleOf3 ? "Fizz\n" : e + "\n";
            }).ToArray();
            var result1 = string.Concat(result);
            Console.WriteLine(result1);
            sw.Stop();
            Console.WriteLine(sw.Elapsed.Milliseconds);
        }
    }
}