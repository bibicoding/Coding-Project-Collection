#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[]) 
{
	int a[3][4]={ {0, 1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11} };
	int sum = 0 ;
	int i, j;
	// 第一維陣列維度為3，i=3
	for (i=0 ; i<3 ; i++)
	{
		// 第二維陣列維度為4，j=4
		for (j=0 ; j<4 ; j++)
		{
			printf(" a[%d][%d]=%2d , ", i, j, a[i][j]);
			sum += a[i][j];
		}
		printf("\n");   /*  將游標移到下一行  */
	}
	printf("\n===  陣列 a 的總和為：%d \n\n", sum);
	system("PAUSE");	
	return 0;
}
