#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	double i,j ;
	for (i=1, j=10 ; i<=10 , j>8 ; i+=0.5 , j-=0.5)
	{
		printf("%3.1f    %3.1f ", i , j );
		printf("\n");
	}
	printf("\n\n");
	system("PAUSE");	
	return 0;
}
