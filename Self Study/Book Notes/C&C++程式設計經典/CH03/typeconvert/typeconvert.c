#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int i=5,j,k=3;
   	float x=5.5,y;
   	j=i/k;
   	y=i/k;
   	printf(" %d \n",j);    			/*  j=1        		*/
   	printf(" %d \n",i/k);        		/*  i/k=1             	*/
   	printf(" %f \n",y);          		/*  y=1.000000 	*/
  	printf(" %f \n",(float)i/k); 	/*  i/k=1.666667 	*/
   	y=x/k;
   	printf(" %f \n",y);         		/*  y=1.833333 	*/
   	printf(" %f \n",x/k);       		/*  x/k=1.833333 	*/
   	printf(" %f \n",(float)x/k);		/*  x/k=1.833333  	*/
   	j=x/k;
   	printf(" %d \n",j);         		/*  j=1           	*/
   	printf(" %f \n",j);         		/*  j=0.000000  	*/
   	printf(" %f \n",x/k);       		/*  x/k=1.833333  	*/

    system("PAUSE");
	return 0;
}
