#include <stdio.h>

void main(void)
{
    int count;
    for (count = 1; count <= 100; count++)
    {
        if (count % 15 == 0)
        {
            printf("FizzBuzz");
        }
        else if (count % 5 == 0)
        {
            printf("Buzz");
        }
        else if (count % 3 == 0)
        {
            printf("Fizz");
        }
        else
        {
            printf("%d ", count);
        }
        printf("\n");
    }
    
}