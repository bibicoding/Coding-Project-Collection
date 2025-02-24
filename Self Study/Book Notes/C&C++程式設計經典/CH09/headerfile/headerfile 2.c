#include <stdio.h>
#include <stdlib.h>
#include "my.h"
int main(int argc, char *argv[])
{
  	int a=10,b=8,c=30,d=15;
	int ch;
	printf("\n =====  Choose Maxinum  =====");
	printf("\n    1. Compare two numbers ");
	printf("\n    2. Compare three numbers ");
	printf("\n    3. Compare four numbers");
	printf("\n    0. Quit :");
	printf("\n ================================");
	printf("\n    Please Choose Number [0-3] : ");
	scanf("%d",&ch);
	if (ch EQU ZERO)
	{
		exit(0);
	}
	else
	{
		if (ch > 3 || ch < 1)
		{
			printf(" Error !!   Please Keyin 1-3 ");
			
		}
		else
		{
			switch (ch)
			{
			case ONE:
				printf(" The MAX(%d,%d) is : %d \n", 
					a, b, MAX2(a,b));
				break;
			case TWO:
				printf(" The MAX(%d,%d,%d) is : %d \n",
					a,b,c, MAX3(a,b,c));
				break;
			case THREE:
				printf(" The MAX(%d,%d,%d,%d) is : %d \n",
					a,b,c,d, MAX4(a,b,c,d));
				break;
			}
		}
	}
    system("PAUSE");	
    return 0;
}
