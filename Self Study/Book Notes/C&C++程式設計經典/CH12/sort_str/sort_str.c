#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(int argc, char *argv[]) {
	char name[5][10];		/* 宣告二維陣列name，用來存放五位學生的姓名 */
	char t[10];
	int i, j;
	printf("-氣泡排氣法(由小到大排序字串)-\n");
	printf("-----請輸入五位學生的姓名-----\n");
	printf("\n");
	printf(" 排序前->\n");
	for(i=0;i<5;i++) 		/* 輸入五位學生的姓名 */
	{
		printf(" 第 %d 位學生：", i+1);
		gets(name[i]);   /* gets_s() for VC++ */
	}
	
	for(i=3;i>=0;i--)							/* 氣泡排序法 */
	{
		for(j=0;j<=i;j++)
		{
			if(strcmp(name[j], name[j+1])>0)	/* 比較字串 */
			{
				strcpy(t, name[j]);	/* 字串互換, strcpy_s() for VC++ */
				strcpy(name[j], name[j+1]);
				strcpy(name[j+1], t);
			}
		}
	}
	printf("\n 排序後->\n");
	for(i=0;i<5;i++)		/* 顯示遞增排序後的結果 */
	{
		printf(" %d.->%s\n", i+1, name[i]);
	}
	printf("\n");
	system("PAUSE");
	return 0;
}
