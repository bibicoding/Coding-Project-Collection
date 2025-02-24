#include <stdio.h>
#include <stdlib.h>

int sum(int);

int main(int argc, char *argv[]) 
{
    int x = sum(10);
    printf("10 + 9 + ¡K + 2 + 1 = %d\n", x);
    system("PAUSE");
	return 0;
}

int sum(int n)
{
    if(n <= 0)
    {
        return 0;
    }
    else
    {
        return n + sum(n - 1);
    }
}
