#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int i, j=0, k;
	printf("    ");			/*r代表一個空白*/
	for(k=0; k<=9; k++)
	{
		printf("%3d", k);
	}
	printf("\n");
	printf("     -----------------------------");
	for (i=0; i<=127; i++)
	{	
		if (i%10==0)
		{
			printf("\n");
			printf(" %2d|", j);	/*r代表一個空白*/
			j++;
		}
		if ( i <= 31)
		{
			printf("   ");		/*r代表一個空白*/
		}else
		{
			printf("  %c", (char)i);	/*r代表一個空白*/
		}
	}
	printf("\n\n");

	system("PAUSE");	
	return 0;
}
