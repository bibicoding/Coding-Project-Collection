#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int i, k;
	printf("\n");
	for (i=1; i<=5; i++)
	{
		for (k=1; i>=k; k++)
		{	
			printf(" %d", k);
		}
		printf("\n");
	}	
	
	system("PAUSE");	
	return 0;
}
