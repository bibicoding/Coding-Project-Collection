#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define BUFSIZE 80

int main(int argc, char *argv[]) {
	/* 宣告可存放100個字元的str1, str2, str3, str4字串 */
	char str1[BUFSIZE], str2[BUFSIZE], str3[BUFSIZE], str4[BUFSIZE];
	char *ptr;					/* 宣告字元指標ptr */
	int keyin, i, j, str_num;
	printf("\n========== 字串的輸入 ==========\n");
	printf(" 請輸入 str1 字串：");
	gets(str1);					/* 輸入的字串指定給str1  gets_s() for VC++ */
	printf(" 請輸入 str2 字串：");
	gets(str2);					/* 輸入的字串指定給str2 gets_s() for VC++  */
	printf("\n========== 字串的比較 ==========\n");
	if(strcmp(str1, str2)==0)		/* 比較字串 */
	{
		printf(" str1字串與str2字串相等\n");
	}
	else if(strcmp(str1, str2)>0)
	{
		printf(" str1字串小於str2字串\n");
	}
	else
	{
		printf(" str1字串大於str2字串\n");
	}
	printf("\n========== 字串的連接 ==========\n");
	strcat(str1,str2);	/* 將str2字串連接到str1字串的後面, strcat_s() for VC++ */
	printf(" str1 字串連接 str2 字串：%s\n", str1);
	printf("\n========== 字串的複製 ==========\n");
	strcpy(str3,str1);/* 將str1字串複製到str3字串, strcpy_s()for VC++  */
	printf(" str1 字串複製到 str3 字串\n");
	printf(" str3 字串是 %s\n", str3);
	printf("\n========== 字串的替換 ==========\n");
	printf(" 請輸入要替換的文字：");
	gets(str4);
	printf(" 請問要替換前幾個字：");
	scanf("%d", &keyin);   /* scanf_s() for VC++ */
	/* 將str3字串前面keyin個字替換成str4字串前面keyin個字 */
	strxfrm(str3, str4, keyin);	
	printf(" 替換後str3 字串是 %s\n", str3);
	printf("\n========== 字串的倒印 ==========\n");
	str_num=strlen(str3);		/*取得str3字串長度，然後指定給str_num*/
	ptr=str3;				/*ptr指標指向str3字串的起始位置*/
	printf(" str3 字串直印是：");
	for(i=0; i<str_num; i++)				/*印出字串*/
	{
		printf("%c", *(ptr+i));
	}
	printf("\n");
	printf(" str3 字串倒印是：");
	for (i=str_num-1, j=0; i>=0 ; i--,j++)	/*倒印字串*/
	{
		printf("%c", *(ptr+i));
	}
	printf("\n");
	
	system("PAUSE");	
	return 0;
}
