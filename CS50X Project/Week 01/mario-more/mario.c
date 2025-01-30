#include <cs50.h>
#include <stdio.h>

void left(int sizes, int height);
void right(int height);

int main(void)
{
    int size;
    do
    {
        size = get_int("Height: ");
    }
    while (size < 1 || size > 8);

    for (int i = 0; i < size; i++)
    {
        left(size, i);
        printf("  ");
        right(i);
        printf("\n");
    }
}

void left(int sizes, int height)
{
    for (int j = sizes - height - 1; j > 0; j--)
    {
        printf(" ");
    }

    for (int k = 0; k <= height; k++)
    {
        printf("#");
    }
}

void right(int height)
{
    for (int j = 0; j <= height; j++)
    {
        printf("#");
    }
}
