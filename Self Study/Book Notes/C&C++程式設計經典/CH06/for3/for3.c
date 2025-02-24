#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int i;
	for (i=10; i>=1; i--)
	{
		printf("%d, ", i);
	}
	printf("\n\n");
	
	for (i=10; i>=1; )
	{
		printf("%d, ",i--);
	}
	printf("\n\n");
	
	for (i=10; i>=1;  )
	{
		printf("%d, ", i);
		i--;
	}
	printf("\n\n");
	
	for (i=10;   ;  )
	{
		if (i>=1)
		{
			printf("%d, ", i);
			i--;
		}
		else
		{
			break;
		}
	}
	printf("\n\n"); 
	system("PAUSE");	
	return 0;
}
