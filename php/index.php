<?php
print_r(
    implode(
        "\n",
        array_map(
            function ($value) {
                if ($value % 15 == 0) {
                    return "FizzBuzz";
                } else if ($value % 5 == 0) {
                    return "Buzz";
                } else if ($value % 3 == 0) {
                    return "Fizz";
                } else {
                    return strval($value);
                }
            },
            range(1, 100)
        )
    )
);

