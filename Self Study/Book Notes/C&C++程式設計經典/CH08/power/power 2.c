#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(int argc, char *argv[]) {
 	int x;  
  	int power3,power2,power1,value;
  
  	printf("請輸入一個整數值 : ");
  	scanf("%d",&x);                   /*  scanf_s() for VC++  */
    
  	power3=pow(x,3.0);
  	power2=pow(x,2.0);
  	power1=pow(x,1.0);  
  	value=4*power3+3*power2+2*power1+1;
  
  	printf("When  x = %d \n",x);
  	printf("f(x)= 4xpow(x,3) + 3xpow(x,2) + 2xpow(x,1) + 1 \n");
  	printf("f(%d)= 4xpow(%d,3) + 3xpow(%d,2) + 2xpow(%d,1) + 1 \n",x,x,x,x);
  	printf("f(%d)= 4x%d + 3x%d + 2x%d + 1 \n",x,power3,power2,power1);
  	printf("f(%d)= %d + %d + %d + 1 \n",x,4*power3,3*power2,2*power1);
  	printf("f(%d)= %d \n",x,value);
  	printf("\n");
  	system("PAUSE");
	return 0;
}
