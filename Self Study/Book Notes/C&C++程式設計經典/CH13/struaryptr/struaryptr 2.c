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
	struct product cd[MAX],*ptr;
	char price[5];
	char keyin[5];
	ptr=cd;
	printf(" ====  CD唱片登入作業 ==== \n\n");
	for (i=0;i<MAX; i++,ptr++)
	{
		printf(" 第 %d 張CD編號：",i+1);
		gets(ptr->no);
		printf("        CD抬頭：");
		gets(ptr->title);
		printf("        售  價：");
		gets(price);
		ptr->price=atoi(price);
		printf("\n");
	}
	printf("\n");
	ptr=cd;
	printf(" 請輸入查尋的CD編號：");
	gets(keyin);
	/* 循序搜尋法 */
	for(i=0; i<3; i++,ptr++)
	{
		if(strcmp(ptr->no,keyin)==0)
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
		printf(" 1. CD 編號 : %s \n", ptr->no);
		printf(" 2. CD 抬頭 : %s \n", ptr->title);
		printf(" 3. 售   價 : %d \n", ptr->price);
	}
	printf(" \n\n");

    system("PAUSE");	
    return 0;
}
