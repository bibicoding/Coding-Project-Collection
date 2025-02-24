#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int n, sum=0, i=0;
    printf(" =求 1 到 100 可以被n整除的整數=\n\n");
	printf(" 請輸入 1 到 100 的整數 n：");
	scanf("%d", &n);
	if (n>=1 && n<=100)
	{
		while (sum+n<=100)
		{
			sum+=n;
			printf("%3d,", sum);
			i++;
			if(i%5==0)
			{
				printf("\n");
			}
		}
		printf("\n\n");
		printf(" 由 1 到 100 有 %d 個整數可以被 %d 整除 ! \n", i, n);
	}
	else
	{
		printf("輸入的資料錯誤!@_@\n");
	}

	system("PAUSE");	
	return 0;
}
