fn main() {
    let range = std::ops::Range { start: 0, end: 1000000 };
    let mut string = String::with_capacity(2 ^ 20);
    let fizz = "Fizz\n";
    let fizzbuzz = "FizzBuzz\n";
    let buzz = "Buzz\n";
    for e in range {
        let mult3 = is_multiple_of3(e);
        let mult5 = is_multiple_of5(e);
        if mult3 && mult5 {
            string.push_str(fizzbuzz)
        } else if mult3 {
            string.push_str(fizz)
        } else if mult5 {
            string.push_str(buzz)
        } else {
            string.push_str(&(e.to_string() + "\n"))
        }
    }
    print!("{}", string)
}

fn is_multiple_of3(n: i32) -> bool {
    n % 3 == 0
}

fn is_multiple_of5(n: i32) -> bool {
    n % 5 == 0
}
