#include <cs50.h>
#include <stdio.h>

int sum2posi(long n, int summing);
int sum1posi(long n, int summing);

int main(void)
{
    long num;
    do
    {
        num = get_long("Number: ");
    }
    while (num < 0);

    int sum = sum2posi((num - num % 10) / 10, 0) + sum1posi(num, 0);
    if (sum % 10 == 0)
    {
        if ((4000000000000 <= num && num < 5000000000000) ||
            (4000000000000000 <= num && num < 5000000000000000))
        {
            printf("VISA\n");
        }
        else if (5100000000000000 <= num && num < 5600000000000000)
        {
            printf("MASTERCARD\n");
        }
        else if ((340000000000000 <= num && num < 350000000000000) ||
                 (370000000000000 <= num && num < 380000000000000))
        {
            printf("AMEX\n");
        }
        else
        {
            printf("INVALID\n");
        }
    }
    else
    {
        printf("INVALID\n");
    }
}

int sum2posi(long n, int summing)
{
    if (n > 0)
    {
        int sum_helper = (n % 10) * 2;
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
