#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <conio.h>
#define MAX 3
struct product
{
	char no[5];
	char title[20];
	int price;
};

int main(int argc, char *argv[])
{
  	int i, num=-1;
	struct product cd[MAX];
	char price[5];
	char keyin[5];
	printf(" ====  CD唱片登入作業 ==== \n\n");
	for (i=0;i<MAX; i++)
	{
		printf(" 第 %d 張CD編號：", i+1);
		gets(cd[i].no);
		printf("        CD抬頭：");
		gets(cd[i].title);
		printf("        售  價：");
		gets(price);
		cd[i].price=atoi(price);  /* 使用atoi()函式將字串轉成整數 */
		printf("\n");
	}
	printf("\n");
	printf(" 請輸入查尋的CD編號：");
	gets(keyin);
	/* 循序搜尋法 */
	for(i=0; i<3; i++)
	{
		if(strcmp(cd[i].no,keyin)==0)
		{
			num=i;
			break;
		}
	}
	/* 顯示循序搜尋法的結果 */
	if(num==-1)
	{
		printf("\n   查無此資料 ! ....");
	}
	else
	{
		printf("\n您要找的CD 詳細資料如下: \n");
		printf(" 1. CD 編號 : %s \n", cd[num].no);
		printf(" 2. CD 抬頭 : %s \n", cd[num].title);
		printf(" 3. 售   價 : %d \n", cd[num].price);
	}
	printf(" \n\n");

   system("PAUSE");	
   return 0;
}
