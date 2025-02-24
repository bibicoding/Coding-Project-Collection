#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[]) {
	int a, b, c, max;
	printf("請連續輸入三個不同的整數 (資料間使用「,」逗號隔開): ");
	scanf("%d,%d,%d", &a, &b, &c);
	if (a>b) {		/*判斷 a 是否大於 b*/
   		if(a>c)		/*判斷 a 是否大於 c*/
            max = a ;
   		else
   			max = c ;
	}
	else { 		
   		if(b>c)		/*判斷 b 是否大於 c*/
	 		max = b ;
   		else
	 		max = c ;
	}	
  	printf("\n比較結果 : %d, %d, %d 三數中最大數為 %d \n\n", a,b,c,max);  
   	system("PAUSE");	
	return 0;
}
