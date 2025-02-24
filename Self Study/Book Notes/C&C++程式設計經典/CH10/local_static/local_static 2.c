#include <stdio.h>
#include <stdlib.h>
void fun1();
int times=1;   				/* 办跑计  */

int main(int argc, char *argv[]) {
	for (times=1 ; times<=5 ; times++)	/* ㊣fun1()ㄧΑ5Ω  */
	{
		fun1();
	}
	printf("\n");
	system("PAUSE");	
	return 0;
}

void fun1()
{
		int a_var=10;     		/* 笆跑计  */
		static int l_stat=10;	/* Ы场繰篈	跑计  */
		printf(" \n 材%dΩ㊣ fun1() a_var1=%d  l_stat= %d \n",
times,a_var++,l_stat++);
}

