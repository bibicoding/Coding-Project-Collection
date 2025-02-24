#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[]) {
 		int data[5];
		/* searchNum:搜尋值	num:要搜尋陣列的註標位置*/
		int n, i, searchNum, num=-1;
		printf("========  循序搜尋法  ========\n\n");
		printf(" 連續輸入五個數字(資料間空一格)\n\n");		
		printf(" 請輸入：");
		for(i=0;i<5;i++)
		{
			scanf("%d", &n);
			data[i]=n;
		}
		printf("\n");
		printf(" 請輸入要搜尋的數值：");
		scanf("%d", &searchNum);
		for(i=0;i<5;i++)
		{
			if(data[i]==searchNum)
			{
				num=i;
			}
		}
		printf(" ========================\n");
		if(num==-1)
		{
			printf("\n 數字 %d 不存在 ! \n", searchNum);
		}
		else
		{
			printf("\n %d 是第 %d 個數字 ! \n", searchNum, (num+1));
		}
	printf("\n\n");
	system("PAUSE");
	return 0;
}
