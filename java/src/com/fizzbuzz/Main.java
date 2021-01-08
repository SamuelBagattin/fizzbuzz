package com.fizzbuzz;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        var r = IntStream.rangeClosed(1, 100)
                .boxed().map(e -> {
                    if (e % 15 == 0) {
                        return "FizzBuzz";
                    } else if (e % 5 == 0) {
                        return "Buzz";
                    } else if (e % 3 == 0) {
                        return "Fizz";
                    } else {
                        return e.toString();
                    }
                }).collect(Collectors.toList());
        System.out.println(String.join("\n", r));
    }
}
