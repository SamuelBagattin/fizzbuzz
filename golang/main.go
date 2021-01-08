package main

import (
	"bytes"
	"strconv"
)

func main() {
	var b bytes.Buffer
	const fizzBuzz = "FizzBuzz\n"
	const fizz = "Fizz\n"
	const buzz = "Buzz\n"
	for i := 0; i < 1000000; i++ {
		mult3 := isMultipleOf3(i)
		mult5 := isMultipleOf5(i)
		if mult3 && mult5 {
			b.WriteString(fizzBuzz)
		}else if mult3 {
			b.WriteString(fizz)
		}else if mult5 {
			b.WriteString(buzz)
		}else{
			b.WriteString(strconv.Itoa(i) + "\n")
		}
	}
	print(b.String())
}

func isMultipleOf3(n int) bool {
	return n % 3 == 0
}

func isMultipleOf5(n int) bool {
	return n % 5 == 0
}