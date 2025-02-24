#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <ctype.h>
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	char ch;
	int ans, keyin, num1, num2;
	do
	{
		printf("\n");
		printf(" 請輸入第 1 個整數：");
		scanf("%d", &num1);
		printf(" 請輸入第 2 個整數：");
		scanf("%d", &num2);
		ans=num1+num2;
		do
		{
			printf(" %d + %d = ", num1, num2);
			scanf("%d", &keyin);
			if(keyin==ans)
			{
				printf(" 答對了!^_^\n");
				break;	
			}
			else
			{
				printf(" 答錯了!@_@\n");
				continue;
			}
		}while(1);
		printf(" 是否(y/n)繼續：");
		ch=tolower(getche());
		printf("\n");
	}while(ch=='y');
	printf("\n");
	system("PAUSE");	
	return 0;
}
