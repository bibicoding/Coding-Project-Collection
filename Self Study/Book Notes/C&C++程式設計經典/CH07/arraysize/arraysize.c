#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[]) 
{
	int i,n,a[]={7,5,3,1,2};
	char c[]={'a','b','c','d','e'};
	n = sizeof(a)/sizeof(int);	/*求a陣列元素的個數然後指定給n*/
	for(i=0 ; i<n ; i++)
	{
		printf("\n a[%d] = %d " , i , a[i] ) ;  
	}
	printf("\n a陣列記憶體空間：%d Bytes\n\n", sizeof(a));
	n = sizeof(c)/sizeof(char);	/*求c陣列元素的個數然後指定給n*/
	for(i=0 ; i<n ; i++)
	{
		printf("\n c[%d] = %d " , i , c[i] ) ;  
	}
	printf("\n c陣列記憶體空間：%d Bytes\n\n", sizeof(c));
	system("PAUSE");	
	return 0;
}
