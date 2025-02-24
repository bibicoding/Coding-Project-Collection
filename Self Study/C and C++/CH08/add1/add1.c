#include <stdio.h>
#include <stdlib.h>

void add(int,int); /* 函式宣告不傳回值 */
int main(int argc, char *argv[]) {
	int a=10, b=20;
	add(20,30); /* 直接傳常數 */
	add(a,b);  /* 傳變數 */
	system("PAUSE");
	return 0;
}

void add(int x,int y)
{
	int temp;
	temp=x+y;
	printf("add(%d,%d)=%d\n\n",x,y,temp);
}

