#include <stdio.h>
#include <stdlib.h>

union unknown
{
	char c;
	int i;
	float f;
};

int main(int argc, char *argv[]) {
	union unknown var2;
	union unknown var1={3.1415926};
	printf("var1.i = %d\n",var1.i);
	printf("var1.f = %f\n",var1.f);
	var1.f=3.33333;
	printf("var1.f = %f\n",var1.f);
	printf("\n");
	var2.i=3;
	printf("var2.i=%d\n",var2.i);
	printf("Size of var2 = %d\n",sizeof(var2));
	var2.c='A';
	printf("var2.c=%d\n",var2.c);
	printf("Size of var1 = %d\n",sizeof(var2));
	var2.f=3.1415926;
	printf("var2.f=%d\n",var2.f);
	printf("Size of var1 = %d\n",sizeof(var2));
	system("PAUSE");	
	return 0;
}
