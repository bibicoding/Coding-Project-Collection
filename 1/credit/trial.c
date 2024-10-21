#include <stdio.h>

// sum up the odd position numbers
// sum1posi => correct
int sum1posi(long n, int summing)
{
    if (n > 0)
    {
        return sum1posi((n - n % 100) / 100, summing + (n % 10));
    }
    else
    {
        return summing;
    }
}


// sum up the even position numbers
// sum2posi => incorrect
int sum2posi(long n, int summing)
{
    if (n > 0)
    {
        int sum_helper = 2 * (n % 10);
        if (sum_helper >= 10)
        {
            sum_helper = sum_helper % 10 + 1;
        }
        return sum2posi((n - n % 100) / 100, summing + sum_helper);
    }
    else
    {
        return summing;
    }
}

int main(void)
{
    printf("%i\n", sum2posi(400360000000001, 0) + sum1posi(4003600000000014, 0));
}

