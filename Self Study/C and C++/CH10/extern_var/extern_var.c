#include <stdio.h>
#include <stdlib.h>
#include "password.h"

int main(int argc, char *argv[]) 
{
	int chk;
	int keyin;
	while(1)
	{
		printf("請輸入密碼：");
		scanf("%d", &keyin);
		chk = pw(keyin);
		if(chk == 1){
			printf("密碼正確!\n");
			printf("結束程式\n");
			break;
		}
		else{
			if(cnt > 0){
				printf("密碼不正確!\n");
				printf("還可輸入%d次\n", cnt); /* 使用password的cnt全域變數 */
				continue;
			}
			else{
				printf("密碼不正確!\n");
				printf("結束程式\n");
				break;
			}
		}
	}
	system("PAUSE");	
	return 0;
}
