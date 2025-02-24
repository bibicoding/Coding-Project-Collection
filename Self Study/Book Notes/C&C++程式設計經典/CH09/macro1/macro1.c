#include <stdio.h>
#include <stdlib.h>
#define PI 3.1416      					/* ﹚竡盽计 */
#define AREA(r) PI*r*r 					/* ﹚竡计厩そΑ */
#define INPUT scanf    					/* 传 */
#define OUTPUT printf  					/* 传 */
#define MSG "Please input radius :"			/* ﹃传 */
#define FMT "The circle area is : %6.2f\n"	/* Α传 */
#define BEEP "\007"      	/* 北じ祇雇羘传 */

int main(int argc, char *argv[])
{
  	int r;
	OUTPUT(MSG);     	/* printf("Please input radius :"); */
	INPUT("%d",&r);		/* scanf("%d",&r); */
    /* printf("The circle area is : %6.2f\n",3.1416*r*r); */
	OUTPUT(FMT,AREA(r));
	OUTPUT(BEEP);     	/* printf("\007"); */
    system("PAUSE");	
    return 0;
}
