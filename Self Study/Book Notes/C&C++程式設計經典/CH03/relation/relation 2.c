#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int a=10, b=5;
	printf(" %d \n", a == b);  	/*  印出0，0表示false */
	printf(" %d \n", a != b);  	/*  印出1，1表示true */
	printf(" %d \n", a > b); 	/*  印出1，1表示true */
	printf(" %d \n", a <= b); 	/*  印出0，0表示false */
   	
    system("PAUSE");	
	return 0;
}
