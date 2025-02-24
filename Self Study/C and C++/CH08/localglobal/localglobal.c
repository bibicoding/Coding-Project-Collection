#include <stdio.h>
#include <stdlib.h>

int a,b,c=30;    /* a,b,c 全域變數 */
void printout();  /* 函式原型宣告 */

int main(int argc, char *argv[]) {
	a=10,b=20;
	printout();
	a=10,b=20;
	printf("\n\n In main-block :");
	printf("\n a= %d",a);
	printf("\n b= %d",b);
	printf("\n c= %d",c);
	if(1)
	{
		int a=100;
		float b=3.6;
		printf("\n\n In IF-Block :");
		printf("\n a= %d",a);
		printf("\n b= %f",b);
		printf("\n c= %d",c);
	}
	printf("\n\n Exit IF-Block But Still in main():");
	printf("\n a= %d",a);
	printf("\n b= %d",b);
	printf("\n c= %d",c);
	printout();
	getch();	  /* _getch() for VC++  */

	return 0;
}

void printout()
 {
	int d=40;
	printf("\n\n In Printout Function :");
	printf("\n a= %d",a);
	printf("\n b= %d",b);
	printf("\n c= %d",c);
	printf("\n d= %d",d);
 }

