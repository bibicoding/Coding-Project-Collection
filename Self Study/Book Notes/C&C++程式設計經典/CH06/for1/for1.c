#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int i;
	for (i=1;i<=20;i+=2)
	{
	  printf(" %d",i);   /* 陪ボ计 */
	  if (i < 20)
	    printf(",");    /* 计硆腹,程计菠 */ 
	}
	printf("\n\n");
	
	system("PAUSE");	
	return 0;
}
