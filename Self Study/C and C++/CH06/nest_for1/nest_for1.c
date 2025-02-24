#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int i, j;
    printf("  |  1   2   3   4   5   6   7   8   9 \n");
    printf("--------------------------------------\n");
	for (i=1; i<=9; i++)		/*¥~¼h°j°é*/
	{
    	printf("%d | ",i);
		for(j=1; j<=9; j++)	/*¤º¼h°j°é*/
		{
			printf("%2d  ", (i * j));
		}
		printf("\n");
	}
	printf("\n");
	system("PAUSE");	
	return 0;
}
