object Main extends App {
  for (i <- 1 to 100) println(if (i % 3 == 0 & i % 5 == 0) "FizzBuzz" else if (i % 5 == 0) "Buzz" else if (i % 3 == 0) "Fizz" else i)
}
