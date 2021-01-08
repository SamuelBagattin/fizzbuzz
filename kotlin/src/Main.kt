const val fizz = "Fizz"
const val buzz = "Buzz"
const val fizzbuzz = "FizzBuzz"

fun main(args: Array<String>) {
    for (i in 1..100){
        when {
            i % 15 == 0 -> {
                println(fizzbuzz)
            }
            i % 5 == 0 -> {
                println(buzz)
            }
            i % 3 == 0 -> {
                println(fizz)
            }
            else -> {
                println(i)
            }
        }
    }
}
