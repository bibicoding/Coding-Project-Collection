#include <stdio.h>
#include <stdlib.h>


int main(int argc, char *argv[]) {
	int a=10,b=20;
	printf("add(20,30)=%d\n\n",add(20,30));   
	printf("add(%d,%d)=%d\n\n",a,b,add(a,b));
	system("PAUSE");

	return 0;
}

int add(int x,int y)
{
	int temp;
	temp=x+y;
	return temp; //將temp傳回給主函式  
}

